package com.igeek.mapper;

import com.igeek.pojo.Insurance;
import com.igeek.pojo.example.InsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceMapper {
    int countByExample(InsuranceExample example);

    int deleteByExample(InsuranceExample example);

    int deleteByPrimaryKey(Integer insuranceno);

    int insert(Insurance record);

    int insertSelective(Insurance record);

    List<Insurance> selectByExample(InsuranceExample example);

    Insurance selectByPrimaryKey(Integer insuranceno);

    int updateByExampleSelective(@Param("record") Insurance record, @Param("example") InsuranceExample example);

    int updateByExample(@Param("record") Insurance record, @Param("example") InsuranceExample example);

    int updateByPrimaryKeySelective(Insurance record);

    int updateByPrimaryKey(Insurance record);
}