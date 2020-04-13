package com.igeek.service;

import com.igeek.pojo.Car;


import java.util.List;

public interface ICarService {
    List<Car> selectAllCar();
    int addCar(Car car);
    int deleteCarById(Integer carno);
    int updateCar(Car car);
    Car selectCarById(Integer carno);
}
