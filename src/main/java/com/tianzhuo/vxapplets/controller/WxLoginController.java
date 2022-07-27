package com.tianzhuo.vxapplets.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.tianzhuo.vxapplets.config.WXPayConstants;
import com.tianzhuo.vxapplets.service.AdAppletsService;
import com.tianzhuo.vxapplets.vo.AdApplets;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Slf4j
@RestController
//@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class WxLoginController {

    @Autowired
    private AdAppletsService adAppletsService;

    /**
     * 微信授权时录入用户数据
     */
    @RequestMapping(value = "wxLogin")
    @ResponseBody
    @Transactional
    public Map<String,Object> insert(@RequestParam("code")String code, HttpSession session) throws ClientProtocolException, IOException {
        //返回map
        System.err.println("微信授权登录");
        System.err.println("code值： "+code);
        Map<String,Object> resultMap = new HashMap<>();
        String appid = WXPayConstants.APP_ID; //自己的APPID
        String secret = WXPayConstants.SECRET; //自己小程序的SECRET
        String loginUrl="https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+code+"&grant_type=authorization_code";
        try {
            CloseableHttpClient client = null;
            CloseableHttpResponse response = null;
            try {
                // 创建http GET请求
                HttpGet httpGet = new HttpGet(loginUrl);
                client = HttpClients.createDefault();
                // 执行请求
                response = client.execute(httpGet);
                HttpEntity entity = response.getEntity();//得到返回数据
                String result = EntityUtils.toString(entity);
                System.err.println("微信返回的结果"+result);
                resultMap.put("data", result);//进行封装
                System.err.println(resultMap);
                JSONObject json_test = JSONObject.parseObject(result);
                String wxOpenid = json_test.getString("openid");
                String sessionKey = json_test.getString("session_key");
                System.err.println("openid值: "+wxOpenid);//得到微信openID
                System.err.println("sessionKey值: "+sessionKey);
                //根据id数据库数据查询
                AdApplets user = adAppletsService.selectByOpenid(wxOpenid);                        System.err.println("用户信息: "+user);
                if (user == null){//如果user等于null说明该用户第一次登录，数据库没有该用户信息。
                    resultMap.put("state", 2000);
                    resultMap.put("data", wxOpenid);
                    resultMap.put("sessionKey", sessionKey);
                    resultMap.put("message", "未查询到用户信息");
                }else {
                    resultMap.put("state", 2000);
                    resultMap.put("data", wxOpenid);//查找的用户信息进行封装返回
                    resultMap.put("sessionKey", sessionKey);
                    resultMap.put("user", user);//查找的用户信息进行封装返回
                    resultMap.put("message", "该用户已存在");
                    return resultMap;
                }
                if(StringUtils.isEmpty(wxOpenid)){
                    resultMap.put("state", 2000);
                    resultMap.put("message", "未获取到openid");
                    return resultMap;
                }
            } finally {
                if (response != null) {
                    response.close();
                }
                if (client != null) {
                    client.close();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultMap;
    }
}
