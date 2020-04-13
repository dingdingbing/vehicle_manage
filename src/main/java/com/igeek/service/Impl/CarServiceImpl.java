package com.igeek.service.Impl;

import com.igeek.mapper.CarMapper;
import com.igeek.pojo.Car;
import com.igeek.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements ICarService {
    @Autowired
    CarMapper carMapper;

    @Override
    public List<Car> selectAllCar() {
        return carMapper.selectByExample(null);
    }

    @Override
    public int addCar(Car car) {
        return carMapper.insert(car);
    }

    @Override
    public int deleteCarById(Integer carno) {
        return carMapper.deleteByPrimaryKey(carno);
    }

    @Override
    public int updateCar(Car car) {
        return carMapper.updateByPrimaryKeySelective(car);
    }

    @Override
    public Car selectCarById(Integer carno) {
        return carMapper.selectByPrimaryKey(carno);
    }
}
