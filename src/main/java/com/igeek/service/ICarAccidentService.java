package com.igeek.service;

import com.igeek.pojo.Accident;


import java.util.List;

public interface ICarAccidentService {

    List<Accident> selectAllAccident();
    int addAccident(Accident accident);
    int deleteAccidentById(Integer accidentno);
    int updateAccident(Accident accident);
    Accident selectAccidentById(Integer accidentno);
}
