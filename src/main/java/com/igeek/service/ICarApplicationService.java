package com.igeek.service;


import com.igeek.pojo.Carapplication;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICarApplicationService {

    List<Carapplication> selectAllCarApp();

    int addCarApplication(Carapplication carApp);

    int deleteCarApplicationById(Integer carAppno);

    int updateCarApplication(Carapplication carApp);

    Carapplication selectCarByAppNo(Integer carAppno);

}
