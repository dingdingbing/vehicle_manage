package com.igeek.mapper;

import com.igeek.pojo.Inspection;
import com.igeek.pojo.example.InspectionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InspectionMapper {
    int countByExample(InspectionExample example);

    int deleteByExample(InspectionExample example);

    int deleteByPrimaryKey(Integer inspectionno);

    int insert(Inspection record);

    int insertSelective(Inspection record);

    List<Inspection> selectByExample(InspectionExample example);

    Inspection selectByPrimaryKey(Integer inspectionno);

    int updateByExampleSelective(@Param("record") Inspection record, @Param("example") InspectionExample example);

    int updateByExample(@Param("record") Inspection record, @Param("example") InspectionExample example);

    int updateByPrimaryKeySelective(Inspection record);

    int updateByPrimaryKey(Inspection record);
}