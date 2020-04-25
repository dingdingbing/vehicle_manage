package com.igeek.service.Impl;


import com.igeek.mapper.CarlocationMapper;
import com.igeek.pojo.Carlocation;
import com.igeek.service.ICarLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarLocationServiceImpl implements ICarLocationService {

    @Autowired
    CarlocationMapper mapper;

    @Override
    public List<Carlocation> list() {
        return mapper.selectByExample(null);
    }

    @Override
    public Carlocation getLocation(Integer id) {
        Carlocation carlocation = mapper.selectByPrimaryKey(id);
        return carlocation;
    }


}
