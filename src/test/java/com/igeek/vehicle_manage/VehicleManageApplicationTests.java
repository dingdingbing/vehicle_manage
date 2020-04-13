package com.igeek.vehicle_manage;

import com.igeek.mapper.CarMapper;
import com.igeek.mapper.CarlocationMapper;
import com.igeek.mapper.DriverMapper;
import com.igeek.pojo.Car;
import com.igeek.pojo.Carlocation;
import com.igeek.pojo.Driver;
import com.igeek.service.ICarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VehicleManageApplicationTests {

    @Autowired
    CarlocationMapper carlocationMapper;

    @Test
    void contextLoads() {
        List<Carlocation> carlocations = carlocationMapper.selectByExample(null);
        System.out.println(carlocations.toString());
    }





}
