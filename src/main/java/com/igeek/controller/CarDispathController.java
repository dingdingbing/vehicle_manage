package com.igeek.controller;

import com.igeek.pojo.Fuel;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarDispathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarDispathController {

    @Autowired
    ICarDispathService carDispathService;

    @RequestMapping("/carDispatch/carRefuelList")
    public String carFuel(Model model){
        List<Fuel> fuels = carDispathService.selectAllFuelApp();
        model.addAttribute("fuels",fuels);
        return "dispatch/carRefuelList";
    }

    @RequestMapping("/carDispatch/carFuelApplication")
    public String carFuelApplication(){
        return "dispatch/carFuelApplication";
    }


    @RequestMapping("/carDispatch/carFuelApplicationAdd")
    public String carFuelApplicationAdd(Fuel fuel){
        carDispathService.addFuelApp(fuel);
        return "redirect:/carDispatch/carRefuelList";
    }

    @RequestMapping("/carDispatch/carFuelApplicationEdit/{registrationnumber}")
    public String carFuelApplicationEdit(@PathVariable(value = "registrationnumber") Integer id,Model model ){
        Fuel fuel = carDispathService.selectFuelAppById(id);
        model.addAttribute("fuel",fuel);
        return "dispatch/carFuelApplicationEdit";
    }

    @RequestMapping("/carDispatch/carFuelApplicationUpdate")
    public String carFuelApplicationUpdate(Fuel fuel){
        int i = carDispathService.updateFuelApp(fuel);
        return "redirect:/carDispatch/carRefuelList";
    }


    @RequestMapping("/carDispatch/carFuelApplicationDelete/{registrationnumber}")
    public String carFuelApplicationDelete(@PathVariable(value = "registrationnumber") Integer id){
        int i = carDispathService.deleteFuelAppByFuelId(id);
        return "redirect:/carDispatch/carRefuelList";
    }

    @ResponseBody
    @RequestMapping("/carDispatch/carFuelApplicationDeleteTest/{registrationnumber}")
    public ResultBean carFuelApplicationDeleteTest(@PathVariable(value = "registrationnumber") Integer id){
        int i = carDispathService.deleteFuelAppByFuelId(id);
        return new ResultBean(0,id,"删除成功");
    }

}
