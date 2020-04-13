package com.igeek.service;


import com.igeek.pojo.Maintain;

import java.util.List;

public interface ICarMaintainService {

    List<Maintain> selectAllMaintain();
    int addMaintain(Maintain maintain);
    int deleteMaintainById(Integer maintainno);
    int updateMaintain(Maintain maintain);
    Maintain selectMaintainById(Integer maintainno);
}
