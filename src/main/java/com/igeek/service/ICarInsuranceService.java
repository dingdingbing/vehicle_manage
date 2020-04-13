package com.igeek.service;

import com.igeek.pojo.Car;
import com.igeek.pojo.Insurance;

import java.util.List;

public interface ICarInsuranceService {

    List<Insurance> selectAllInsurance();
    int addInsurance(Insurance insurance);
    int deleteInsuranceById(Integer insuranceNo);
    int updateInsurance(Insurance insurance);
    Insurance selectInsuranceById(Integer insuranceNo);
}
