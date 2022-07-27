package com.tianzhuo.vxapplets.service;

import com.tianzhuo.vxapplets.vo.AdApplets;

public interface AdAppletsService {
    Integer insertAdApplets(AdApplets adApplets);

    AdApplets selectByOpenid(String wxOpenid);
}
