package com.igeek.service.Impl;

import com.igeek.mapper.InspectionMapper;
import com.igeek.pojo.Inspection;
import com.igeek.service.ICarInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarInspectionServiceImp implements ICarInspectionService {

    @Autowired
    InspectionMapper inspectionMapper;

    @Override
    public List<Inspection> selectAllInspection() {
        return inspectionMapper.selectByExample(null);
    }

    @Override
    public int addInspection(Inspection inspection) {
        return inspectionMapper.insert(inspection);
    }

    @Override
    public int deleteInspectionById(Integer inspectionNo) {
        return inspectionMapper.deleteByPrimaryKey(inspectionNo);
    }

    @Override
    public int updateInspection(Inspection inspection) {
        return inspectionMapper.updateByPrimaryKey(inspection);
    }

    @Override
    public Inspection selectInspectionById(Integer inspectionNo) {
        return inspectionMapper.selectByPrimaryKey(inspectionNo);
    }
}
