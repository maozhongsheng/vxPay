package com.tianzhuo.vxapplets.controller;

import com.tianzhuo.vxapplets.mapper.AppletsOrderMapper;
import com.tianzhuo.vxapplets.service.AppletsOrderService;
import com.tianzhuo.vxapplets.utils.HttpClientUtil;
import com.tianzhuo.vxapplets.utils.WXPayConstants;
import com.tianzhuo.vxapplets.utils.WXPayUtil;
import com.tianzhuo.vxapplets.vo.AppletsOrder;
import com.tianzhuo.vxapplets.vo.Response.ResponseResult;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.tianzhuo.vxapplets.utils.ResponseStatus.SUCCESS;

@RestController
public class PayController {


    @Autowired
    private AppletsOrderMapper appletsOrderMapper;

    @Autowired
    private AppletsOrderService appletsOrderService;

    /*调用支付接口*/
    @RequestMapping(value = "prePay" ,method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> prePay(Long id, HttpServletRequest request){

        // 返回参数
        Map<String, Object> resMap = new HashMap<>();
        //获取请求ip地址
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        if(ip.indexOf(",")!=-1){
            String[] ips = ip.split(",");
            ip = ips[0].trim();
        }

        try {

            System.out.println("id= "+id);
            // 拼接统一下单地址参数
            AppletsOrder appletsOrder = new AppletsOrder();
            AppletsOrder order = appletsOrderService.insertAppletsOrder(appletsOrder,id).get(0);
            Map<String, Object> paraMap = new HashMap<>();
           // AppletsOrder order =  appletsOrderMapper.selectByPrimaryKey(id);
            String body = order.getOrder_name();//商品名称
            String orderNum = order.getOrder_number();//订单号
            String openId = order.getOpenId();
            String money = order.getOrder_money().toString();
            Integer price = Integer.valueOf(money);
//       Integer price = 1;//支付金额，单位：分，这边需要转成字符串类型，否则后面的签名会失败
            System.out.println("body= "+body);
//       body = new String(body.getBytes("ISO-8859-1"),"UTF-8").toString();
//       System.out.println("body= "+body);
            // 封装11个必需的参数
            paraMap.put("appid", WXPayConstants.APP_ID);
            paraMap.put("mch_id", WXPayConstants.MCH_ID);//商家ID
            paraMap.put("nonce_str", WXPayUtil.generateNonceStr());//获取随机字符串 Nonce Str
            paraMap.put("body", body);     //商品名称
            paraMap.put("out_trade_no", orderNum);//订单号
            paraMap.put("total_fee",price);    //测试改为固定金额
            paraMap.put("spbill_create_ip", ip);
            paraMap.put("notify_url",WXPayConstants.CALLBACK_URL);// 此路径是微信服务器调用支付结果通知路径
            paraMap.put("trade_type", "JSAPI");
            paraMap.put("openid", openId);
            String sign = WXPayUtil.generateSignature(paraMap, WXPayConstants.PATERNER_KEY);//商户密码
            //生成签名. 注意，若含有sign_type字段，必须和signType参数保持一致。
            paraMap.put("sign", sign);
            //将所有参数(map)转xml格式
            String xml = WXPayUtil.mapToXml(paraMap);
//        xml = new String(xml.getBytes("ISO-8859-1"), "UTF-8");
//       String xml = new String(WXPayUtil.mapToXml(paraMap).getBytes(), "utf-8");
            System.err.println("xml=: "+xml);
            // 统一下单 https://api.mch.weixin.qq.com/pay/unifiedorder
            String unifiedorder_url = WXPayConstants.UNIFIEDORDER_URL;//统一下单接口
            System.out.println("统一下单接口unifiedorder_url:"+unifiedorder_url);
            //发送post请求"统一下单接口"返回预支付id:prepay_id
            String xmlStr = HttpClientUtil.doPostXml(unifiedorder_url, xml);
            System.out.println("xmlStr:"+xmlStr);
            //以下内容是返回前端页面的json数据
            //预支付id
            String prepay_id = "";
            if (xmlStr.indexOf("SUCCESS") != -1) {
                Map<String, Object> map = WXPayUtil.xmlToMap(xmlStr);//XML格式字符串转换为Map
                prepay_id =  map.get("prepay_id").toString();
                System.err.println("prepay_id_1=  "+prepay_id);
            }
            System.err.println("prepay_id_2=  "+prepay_id);
            Map<String, Object> payMap = new HashMap<String, Object>();
            // 封装所需6个参数调支付页面
            payMap.put("appId", WXPayConstants.APP_ID);
            payMap.put("timeStamp", WXPayUtil.getCurrentTimestamp()+"");//获取当前时间戳，单位秒
            payMap.put("nonceStr", WXPayUtil.generateNonceStr());//获取随机字符串 Nonce Str
            payMap.put("signType", "MD5");
            payMap.put("package", "prepay_id="+prepay_id);
            //生成带有 sign 的 XML 格式字符串
            String paySign = WXPayUtil.generateSignature(payMap, WXPayConstants.PATERNER_KEY);
            payMap.put("paySign", paySign);
            // 封装正常情况返回数据
            resMap.put("success",true);
            resMap.put("payMap",payMap);
        } catch (Exception e) {
            // 封装异常情况返回数据
            resMap.put("success",false);
            resMap.put("message","调用统一订单接口错误");
            e.printStackTrace();
        }
        return resMap;
    }

    /*支付成功回调*/
    @RequestMapping("callBack")
    public ResponseResult callBack(HttpServletRequest request, HttpServletResponse response){
        ResponseResult result = new ResponseResult();
        System.err.println("微信支付成功,微信发送的callback信息,请注意修改订单信息");
        InputStream is = null;
                    String resXml = "";
                    try {
                        is = request.getInputStream();//获取请求的流信息(这里是微信发的xml格式所有只能使用流来读)
                        String xml = WXPayUtil.inputStream2String(is);
                        Map<String, Object> notifyMap = WXPayUtil.xmlToMap(xml);//将微信发的xml转map
                        if(notifyMap.get("return_code").equals("SUCCESS")){


                            String ordersNum = notifyMap.get("out_trade_no").toString();//商户订单号
                            //处理订单状态
//          String openid = notifyMap.get("openid");
                            Date zhifutime = new Date();
                            Integer ordertype = 1;//1支付完成
                            AppletsOrder appletsOrder = new AppletsOrder();
                            appletsOrder.setOrder_number(ordersNum);
                            appletsOrder.setOrder_time(zhifutime);
                            appletsOrder.setOrder_state(ordertype);
                            try {
                                appletsOrderService.updateByOrdersNum(appletsOrder);
                                result.setData(SUCCESS);
                                result.setData("支付回调成功，修改订单状态为支付成功");
                                //请求支付回调
                                //回调等待时间
                                //if(success){
                                //修改订单信息
                                //返回前端数据
                           // }
                    //告诉微信服务器收到信息了，不要在调用回调action了========这里很重要回复微信服务器信息用流发送一个xml即可
//             response.getWriter().write(XMLUtil.setXML("SUCCESS", "OK")); // 告诉微信服务器，我收到信息了，不要在调用回调action了
//             StringBuffer s = new StringBuffer();
//             s.append("<xml>");
//             s.append("<return_code><![CDATA[SUCCESS]]></return_code>");
//             s.append("<return_msg><![CDATA[OK]]></return_msg>");
//             s.append("</xml>");
//             response.getWriter().write(String.valueOf(s));
                    resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
                            + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
                    BufferedOutputStream out = new BufferedOutputStream(
                            response.getOutputStream());
                    out.write(resXml.getBytes());
                    out.flush();
                    out.close();
                    System.err.println("返回给微信的值："+resXml.getBytes());
                    is.close();
                }catch (Exception e){
                    result.setMsg("订单状态修改失败");
                }


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }





    /*调用退款接口，取消订单*/
    @RequestMapping("refund")
    @ResponseBody
    public Map<String, Object> refund(Long id,HttpServletResponse response){

        // 返回参数
        Map<String, Object> resMap = new HashMap<>();
        Date newtime = new Date();
        String resXml = "";
        try {
            // 拼接统一下单地址参数
            Map<String, Object> paraMap = new HashMap<>();
            AppletsOrder order =  appletsOrderMapper.selectByPrimaryKey(id);
            String orderNum = order.getOrder_number();//订单号
            String money = order.getOrder_money().toString();//金额
            Integer price = Integer.valueOf(money);
//       Integer price = 1;//支付金额，单位：分，这边需要转成字符串类型，否则后面的签名会失败
            System.out.println("订单号= "+orderNum);
            // 封装必需的参数
            paraMap.put("appid", WXPayConstants.APP_ID);
            paraMap.put("mch_id", WXPayConstants.MCH_ID);//商家ID
            paraMap.put("nonce_str", WXPayUtil.generateNonceStr());//获取随机字符串 Nonce Str
            paraMap.put("out_trade_no", orderNum);//订单号
            paraMap.put("out_refund_no", orderNum);//商户退款单号
            paraMap.put("total_fee",price);    //测试改为固定金额  订单金额
            paraMap.put("refund_fee",price);    //退款金额
//       paraMap.put("notify_url", WXPayConstants.notify_url);   //退款路径
            String sign = WXPayUtil.generateSignature(paraMap, WXPayConstants.PATERNER_KEY);//商户密码
            //生成签名. 注意，若含有sign_type字段，必须和signType参数保持一致。
            paraMap.put("sign", sign);
            //将所有参数(map)转xml格式
            String xml = WXPayUtil.mapToXml(paraMap);
            System.out.println("xml:"+xml);
            // 退款 https://api.mch.weixin.qq.com/secapi/pay/refund
            String refund_url = WXPayConstants.REFUND_URL;//申请退款路径接口
            System.out.println("refund_url:"+refund_url);
            //发送post请求"申请退款"
            String xmlStr = HttpClientUtil.doRefund(refund_url, xml);
            System.out.println("退款xmlStr:"+xmlStr);
            /*退款成功回调修改订单状态*/
            if (xmlStr.indexOf("SUCCESS") != -1) {
                Map<String, Object> map = WXPayUtil.xmlToMap(xmlStr);//XML格式字符串转换为Map
                if(map.get("return_code").equals("SUCCESS")){
                    resMap.put("success",true);//此步说明退款成功
                    resMap.put("data","退款成功");
                    System.out.println("退款成功");
                    Date refundtime = new Date();
                    Integer ordertype = -1;//-1取消订单
                    AppletsOrder appletsOrder = new AppletsOrder();
                    appletsOrder.setOrder_number(orderNum);
                    appletsOrder.setOrder_time(refundtime);
                    appletsOrder.setOrder_state(ordertype);
                    try {
                        appletsOrderService.updateByOrdersNum(appletsOrder);
                        //告诉微信服务器收到信息了，不要在调用回调action了========这里很重要回复微信服务器信息用流发送一个xml即可
                        resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
                                + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
                        BufferedOutputStream out = new BufferedOutputStream(
                                response.getOutputStream());
                        out.write(resXml.getBytes());
                        out.flush();
                        out.close();
                        System.err.println("返回给微信的值："+resXml.getBytes());
                    }catch (Exception e){
                        resMap.put("fail","订单状态修改失败");
                    }
                }

            }else {
                resMap.put("success","fail");//此步说明退款成功
                resMap.put("data","退款失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resMap;
    }
}
