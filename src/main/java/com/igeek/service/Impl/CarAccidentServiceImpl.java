package com.igeek.service.Impl;

import com.igeek.mapper.AccidentMapper;
import com.igeek.pojo.Accident;
import com.igeek.service.ICarAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarAccidentServiceImpl implements ICarAccidentService {

    @Autowired
    AccidentMapper accidentMapper;


    @Override
    public List<Accident> selectAllAccident() {
        return accidentMapper.selectByExample(null);
    }

    @Override
    public int addAccident(Accident accident) {
        return accidentMapper.insert(accident);
    }

    @Override
    public int deleteAccidentById(Integer accidentno) {
        return accidentMapper.deleteByPrimaryKey(accidentno);
    }

    @Override
    public int updateAccident(Accident accident) {
        return accidentMapper.updateByPrimaryKey(accident);
    }

    @Override
    public Accident selectAccidentById(Integer accidentno) {
        return accidentMapper.selectByPrimaryKey(accidentno);
    }
}
