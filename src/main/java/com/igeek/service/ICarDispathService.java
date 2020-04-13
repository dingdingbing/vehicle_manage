package com.igeek.service;


import com.igeek.pojo.Fuel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICarDispathService {

    List<Fuel> selectAllFuelApp();

    int addFuelApp(Fuel fuel);

    int deleteFuelAppByFuelId(Integer registrationNumber);

    int updateFuelApp(Fuel fuel);

    Fuel selectFuelAppById(Integer registrationNumber);

}
