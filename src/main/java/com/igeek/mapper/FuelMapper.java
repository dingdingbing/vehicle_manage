package com.igeek.mapper;

import com.igeek.pojo.Fuel;
import java.util.List;

import com.igeek.pojo.example.FuelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelMapper {
    int countByExample(FuelExample example);

    int deleteByExample(FuelExample example);

    int deleteByPrimaryKey(Integer registrationnumber);

    int insert(Fuel record);

    int insertSelective(Fuel record);

    List<Fuel> selectByExample(FuelExample example);

    Fuel selectByPrimaryKey(Integer registrationnumber);

    int updateByExampleSelective(@Param("record") Fuel record, @Param("example") FuelExample example);

    int updateByExample(@Param("record") Fuel record, @Param("example") FuelExample example);

    int updateByPrimaryKeySelective(Fuel record);

    int updateByPrimaryKey(Fuel record);
}