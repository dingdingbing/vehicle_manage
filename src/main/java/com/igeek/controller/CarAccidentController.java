package com.igeek.controller;

import com.igeek.pojo.Accident;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class CarAccidentController {

    @Autowired
    ICarAccidentService carAccidentService;

    @RequestMapping("/carDispatch/carAccidentApplication")
    public String carAccidentApplication(){
        return "dispatch/carAccidentApplication";
    }

    @RequestMapping("/carDispatch/carAccidentList")
    public String carAccidentList(Model model){
        List<Accident> accidents = carAccidentService.selectAllAccident();
        model.addAttribute("accidents",accidents);
        return "dispatch/carAccidentList";
    }


    @RequestMapping("/carDispatch/carAccidentAdd")
    public String carAccidentAdd(Accident accident){
        carAccidentService.addAccident(accident);
        return "redirect:/carDispatch/carAccidentList";
    }

    @ResponseBody
    @RequestMapping("/carDispatch/carAccidentDelete/{accidentno}")
    public ResultBean carAccidentDelete(@PathVariable(value = "accidentno")Integer id){
        int i = carAccidentService.deleteAccidentById(id);
        if(i>0){
            return new ResultBean(0,id,"删除成功");
        }
        return new ResultBean(500,id,"删除失败");
    }


    @RequestMapping("/carDispatch/carAccidentEdit/{accidentno}")
    public String carAccidentEdit(@PathVariable(value = "accidentno")Integer id,Model model){
        Accident accident = carAccidentService.selectAccidentById(id);
        model.addAttribute("accident",accident);
        return "dispatch/carAccidentEdit";
    }


    @RequestMapping("/carDispatch/carAccidentUpdate")
    public String carAccidentUpdate(Accident accident){
        carAccidentService.updateAccident(accident);
        return "redirect:/carDispatch/carAccidentList";
    }

}
