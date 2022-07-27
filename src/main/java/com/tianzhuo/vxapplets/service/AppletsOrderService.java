package com.tianzhuo.vxapplets.service;

import com.tianzhuo.vxapplets.vo.AppletsOrder;

import java.util.List;
import java.util.Map;

public interface AppletsOrderService {
    List<AppletsOrder> insertAppletsOrder(AppletsOrder appletsOrder, Long id);

    Map<String,String> xcxPayment(String orderNo, double money, String openId) throws Exception;

    int xcxNotify(Map<String, Object> map) throws Exception;

    int updateByOrdersNum(AppletsOrder appletsOrder);
}
