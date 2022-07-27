package com.tianzhuo.vxapplets.service.impl;


import com.tianzhuo.vxapplets.mapper.AdAppletsMapper;
import com.tianzhuo.vxapplets.service.AdAppletsService;
import com.tianzhuo.vxapplets.vo.AdApplets;
import com.tianzhuo.vxapplets.vo.AdAppletsExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
@Repository
public class AdAppletsServiceImpl implements AdAppletsService {
    
    @Autowired
    AdAppletsMapper adAppletsMapper;
    
    @Override
    public Integer insertAdApplets(AdApplets adApplets) {
        AdAppletsExample example = new AdAppletsExample();
        AdAppletsExample.Criteria criteria = example.createCriteria();
        criteria.andIphoneEqualTo(adApplets.getOpenid());
        List<AdApplets> adAppletsList = adAppletsMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(adAppletsList)){
            adApplets.setPv(1);
            adApplets.setPayment(0);
            adApplets.setCreat_time(new Date());
            adApplets.setIs_delete(0);
            return adAppletsMapper.insert(adApplets);
        }else {
            AdApplets adApplets1 = adAppletsList.get(0);
            adApplets1.setPv(adApplets1.getPv()+1);
            return adAppletsMapper.updateByPrimaryKey(adApplets1);
        }
    }

    @Override
    public AdApplets selectByOpenid(String wxOpenid) {
        AdApplets adApplets = adAppletsMapper.selectByOpenid(wxOpenid);
        if (!ObjectUtils.isEmpty(adApplets)){
            AdApplets adApplets1 = new AdApplets();
            adApplets1.setPv(adApplets.getPv()+1);
            adApplets1.setId(adApplets.getId());
            adAppletsMapper.updateByPrimaryKey(adApplets1);
        }
        return adApplets;
    }
}
