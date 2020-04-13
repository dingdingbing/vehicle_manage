package com.igeek.service.Impl;

import com.igeek.mapper.CarapplicationMapper;
import com.igeek.pojo.Carapplication;
import com.igeek.service.ICarApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarApplicationServiceImpl implements ICarApplicationService {

    @Autowired
    CarapplicationMapper carAppMapper;

    @Override
    public List<Carapplication> selectAllCarApp() {

        return carAppMapper.selectByExample(null);
    }

    @Override
    public int addCarApplication(Carapplication carApp) {

        return carAppMapper.insert(carApp);
    }

    @Override
    public int deleteCarApplicationById(Integer carAppno) {
        return carAppMapper.deleteByPrimaryKey(carAppno);
    }

    @Override
    public int updateCarApplication(Carapplication carApp) {
        return carAppMapper.updateByPrimaryKey(carApp);
    }

    @Override
    public Carapplication selectCarByAppNo(Integer carAppno) {
        return carAppMapper.selectByPrimaryKey(carAppno);
    }
}
