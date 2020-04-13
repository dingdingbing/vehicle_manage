package com.igeek.mapper;

import com.igeek.pojo.Accident;
import com.igeek.pojo.example.AccidentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccidentMapper {
    int countByExample(AccidentExample example);

    int deleteByExample(AccidentExample example);

    int deleteByPrimaryKey(Integer accidentno);

    int insert(Accident record);

    int insertSelective(Accident record);

    List<Accident> selectByExample(AccidentExample example);

    Accident selectByPrimaryKey(Integer accidentno);

    int updateByExampleSelective(@Param("record") Accident record, @Param("example") AccidentExample example);

    int updateByExample(@Param("record") Accident record, @Param("example") AccidentExample example);

    int updateByPrimaryKeySelective(Accident record);

    int updateByPrimaryKey(Accident record);
}