package com.igeek.service;

import com.igeek.pojo.Driver;

import java.util.List;

public interface IDriverService {
    List<Driver> selectAllDriver();
    Driver selectDriverByName(String driverName);
    int deleteDriverById(Integer driverId);
    int addDriver(Driver driver);
    int updateDriver(Driver driver);
    Driver selectDriverById(Integer driverId);
}
