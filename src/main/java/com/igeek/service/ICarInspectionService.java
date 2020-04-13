package com.igeek.service;

import com.igeek.pojo.Inspection;

import java.util.List;

public interface ICarInspectionService {

    List<Inspection> selectAllInspection();
    int addInspection(Inspection inspection);
    int deleteInspectionById(Integer inspectionNo);
    int updateInspection(Inspection inspection);
    Inspection selectInspectionById(Integer inspectionNo);

}
