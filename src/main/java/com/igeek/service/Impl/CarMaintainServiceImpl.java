package com.igeek.service.Impl;

import com.igeek.mapper.MaintainMapper;
import com.igeek.pojo.Maintain;
import com.igeek.service.ICarMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarMaintainServiceImpl implements ICarMaintainService {

    @Autowired
    MaintainMapper maintainMapper;

    @Override
    public List<Maintain> selectAllMaintain() {
        return maintainMapper.selectByExample(null);
    }

    @Override
    public int addMaintain(Maintain maintain) {
        return maintainMapper.insert(maintain);
    }

    @Override
    public int deleteMaintainById(Integer maintainno) {
        return maintainMapper.deleteByPrimaryKey(maintainno);
    }

    @Override
    public int updateMaintain(Maintain maintain) {
        return maintainMapper.updateByPrimaryKey(maintain);
    }

    @Override
    public Maintain selectMaintainById(Integer maintainno) {
        return maintainMapper.selectByPrimaryKey(maintainno);
    }
}
