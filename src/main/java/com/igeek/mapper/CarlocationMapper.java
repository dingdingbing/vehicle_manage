package com.igeek.mapper;

import com.igeek.pojo.Carlocation;

import com.igeek.pojo.example.CarlocationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarlocationMapper {
    int countByExample(CarlocationExample example);

    int deleteByExample(CarlocationExample example);

    int deleteByPrimaryKey(Integer carno);

    int insert(Carlocation record);

    int insertSelective(Carlocation record);

    List<Carlocation> selectByExample(CarlocationExample example);

    Carlocation selectByPrimaryKey(Integer carno);

    int updateByExampleSelective(@Param("record") Carlocation record, @Param("example") CarlocationExample example);

    int updateByExample(@Param("record") Carlocation record, @Param("example") CarlocationExample example);

    int updateByPrimaryKeySelective(Carlocation record);

    int updateByPrimaryKey(Carlocation record);
}