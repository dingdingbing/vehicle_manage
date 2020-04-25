package com.igeek.controller;

import com.igeek.pojo.Carlocation;
import com.igeek.service.ICarLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CarLocationController {

    @Autowired
    ICarLocationService service;

    @RequestMapping("/car/locations")
    public String list(Model model){
        List<Carlocation> cars = service.list();
        model.addAttribute("cars", cars);
        return "car/carLocation";
    }

    @RequestMapping("/car/location/{id}")
    public String getLocation(@PathVariable(value = "id")Integer id, Model model){
        Carlocation location = service.getLocation(id);
        model.addAttribute("carLocation", location);
        System.out.println(location);
        return "car/carMap";
    }
}
