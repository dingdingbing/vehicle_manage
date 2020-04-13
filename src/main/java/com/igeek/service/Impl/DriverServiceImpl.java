package com.igeek.service.Impl;

import com.igeek.mapper.DriverMapper;
import com.igeek.pojo.Driver;
import com.igeek.pojo.example.DriverExample;
import com.igeek.service.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements IDriverService {
    @Autowired
    private DriverMapper driverMapper;
    @Override
    public List<Driver> selectAllDriver() {
        return driverMapper.selectByExample(null);
    }

    @Override
    public Driver selectDriverByName(String driverName) {
        DriverExample driverExample = new DriverExample();
        DriverExample.Criteria criteria = driverExample.createCriteria();
        criteria.andDrivernameEqualTo(driverName);
        List<Driver> drivers = driverMapper.selectByExample(driverExample);
        if(drivers!=null && drivers.size()>0){
            return drivers.get(0);
        }
        return null;
    }

    @Override
    public int deleteDriverById(Integer driverId) {
        return driverMapper.deleteByPrimaryKey(driverId);
    }

    @Override
    public int addDriver(Driver driver) {
        return driverMapper.insert(driver);
    }

    @Override
    public int updateDriver(Driver driver) {
        return driverMapper.updateByPrimaryKey(driver);
    }

    @Override
    public Driver selectDriverById(Integer driverId) {

        return  driverMapper.selectByPrimaryKey(driverId);
    }
}
