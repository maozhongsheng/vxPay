package com.tianzhuo.vxapplets.service.impl;//package com.tianzhuo.ad.service.impl;


import com.tianzhuo.vxapplets.mapper.AppletsOrderMapper;
import com.tianzhuo.vxapplets.mapper.CommodityMapper;
import com.tianzhuo.vxapplets.service.AppletsOrderService;
import com.tianzhuo.vxapplets.vo.AppletsOrder;
import com.tianzhuo.vxapplets.vo.AppletsOrderExample;
import com.tianzhuo.vxapplets.vo.Commodity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@Service
@Repository
public class AppletsOrderServiceImpl implements AppletsOrderService {

    @Autowired
    AppletsOrderMapper appletsOrderMapper;

    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<AppletsOrder> insertAppletsOrder(AppletsOrder appletsOrder,Long id) {
        Commodity commodity = commodityMapper.selectByPrimaryKey(id);
        String s = UUID.randomUUID().toString().substring(32);
        appletsOrder.setOrder_number(s);
        appletsOrder.setOrder_name(commodity.getCommodity_name());
        appletsOrder.setCommodity_id(commodity.getId().intValue());
        appletsOrder.setOrder_state(0);
        appletsOrder.setNext_person("123");
        appletsOrder.setOrder_time(new Date());
        appletsOrder.setOpenId("1");
        appletsOrder.setOrder_money(Integer.valueOf(commodity.getDiscount_amount()));
        appletsOrderMapper.insertSelective(appletsOrder);
        AppletsOrderExample example =new AppletsOrderExample();
        AppletsOrderExample.Criteria criteria = example.createCriteria();
        criteria.andOrder_numberEqualTo(s);
       // List<AppletsOrder> appletsOrders = appletsOrderMapper.selectByExample(example);
        return appletsOrderMapper.selectByExample(example);
    }

    @Override
    public Map<String, String> xcxPayment(String orderNo, double money, String openId) throws Exception {
        return null;
    }

    @Override
    public int xcxNotify(Map<String, Object> map) throws Exception {
        return 0;
    }

    @Override
    public int updateByOrdersNum(AppletsOrder appletsOrder) {

        return appletsOrderMapper.updateByOrdersNum(appletsOrder);
    }


}
