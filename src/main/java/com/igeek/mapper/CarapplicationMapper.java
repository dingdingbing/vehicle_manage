package com.igeek.mapper;

import com.igeek.pojo.Carapplication;
import com.igeek.pojo.example.CarapplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarapplicationMapper {
    int countByExample(CarapplicationExample example);

    int deleteByExample(CarapplicationExample example);

    int deleteByPrimaryKey(Integer applicationno);

    int insert(Carapplication record);

    int insertSelective(Carapplication record);

    List<Carapplication> selectByExample(CarapplicationExample example);

    Carapplication selectByPrimaryKey(Integer applicationno);

    int updateByExampleSelective(@Param("record") Carapplication record, @Param("example") CarapplicationExample example);

    int updateByExample(@Param("record") Carapplication record, @Param("example") CarapplicationExample example);

    int updateByPrimaryKeySelective(Carapplication record);

    int updateByPrimaryKey(Carapplication record);
}