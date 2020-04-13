package com.igeek.service.Impl;

import com.igeek.mapper.InsuranceMapper;
import com.igeek.pojo.Insurance;
import com.igeek.service.ICarInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarInsuranceServiceServiceImpl implements ICarInsuranceService {

    @Autowired
    InsuranceMapper insuranceMapper;

    @Override
    public List<Insurance> selectAllInsurance() {
        return insuranceMapper.selectByExample(null);
    }

    @Override
    public int addInsurance(Insurance insurance) {
        return insuranceMapper.insert(insurance);
    }

    @Override
    public int deleteInsuranceById(Integer insuranceNo) {
        return insuranceMapper.deleteByPrimaryKey(insuranceNo);
    }

    @Override
    public int updateInsurance(Insurance insurance) {
        return insuranceMapper.updateByPrimaryKey(insurance);
    }

    @Override
    public Insurance selectInsuranceById(Integer insuranceNo) {
        return insuranceMapper.selectByPrimaryKey(insuranceNo);
    }
}
