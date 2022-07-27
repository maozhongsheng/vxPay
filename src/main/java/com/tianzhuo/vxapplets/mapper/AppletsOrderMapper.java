package com.tianzhuo.vxapplets.mapper;

import com.tianzhuo.vxapplets.vo.AppletsOrder;
import com.tianzhuo.vxapplets.vo.AppletsOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppletsOrderMapper {
    long countByExample(AppletsOrderExample example);

    int deleteByExample(AppletsOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppletsOrder record);

    int insertSelective(AppletsOrder record);

    List<AppletsOrder> selectByExample(AppletsOrderExample example);

    AppletsOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppletsOrder record, @Param("example") AppletsOrderExample example);

    int updateByExample(@Param("record") AppletsOrder record, @Param("example") AppletsOrderExample example);

    int updateByPrimaryKeySelective(AppletsOrder record);

    int updateByPrimaryKey(AppletsOrder record);

    int updateByOrdersNum(AppletsOrder appletsOrder);
}