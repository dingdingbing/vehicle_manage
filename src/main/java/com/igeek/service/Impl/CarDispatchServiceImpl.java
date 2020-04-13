package com.igeek.service.Impl;

import com.igeek.mapper.FuelMapper;
import com.igeek.pojo.Fuel;
import com.igeek.service.ICarDispathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDispatchServiceImpl implements ICarDispathService {

    @Autowired
    FuelMapper fuelMapper;

    @Override
    public List<Fuel> selectAllFuelApp() {
        return fuelMapper.selectByExample(null);
    }

    @Override
    public int addFuelApp(Fuel fuel) {
        return fuelMapper.insert(fuel);
    }

    @Override
    public int deleteFuelAppByFuelId(Integer registrationNumber) {
        return fuelMapper.deleteByPrimaryKey(registrationNumber);
    }

    @Override
    public int updateFuelApp(Fuel fuel) {
        return fuelMapper.updateByPrimaryKey(fuel);
    }

    @Override
    public Fuel selectFuelAppById(Integer registrationNumber) {
        return fuelMapper.selectByPrimaryKey(registrationNumber);
    }
}
