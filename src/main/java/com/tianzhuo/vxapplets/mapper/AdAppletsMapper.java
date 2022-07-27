package com.tianzhuo.vxapplets.mapper;

import java.util.List;

import com.tianzhuo.vxapplets.vo.AdApplets;
import com.tianzhuo.vxapplets.vo.AdAppletsExample;
import org.apache.ibatis.annotations.Param;

public interface AdAppletsMapper {
    long countByExample(AdAppletsExample example);

    int deleteByExample(AdAppletsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdApplets record);

    int insertSelective(AdApplets record);

    List<AdApplets> selectByExample(AdAppletsExample example);

    AdApplets selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdApplets record, @Param("example") AdAppletsExample example);

    int updateByExample(@Param("record") AdApplets record, @Param("example") AdAppletsExample example);

    int updateByPrimaryKeySelective(AdApplets record);

    int updateByPrimaryKey(AdApplets record);

    AdApplets selectByOpenid(String wxOpenid);
}