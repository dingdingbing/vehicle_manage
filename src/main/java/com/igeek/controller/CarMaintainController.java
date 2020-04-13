package com.igeek.controller;

import com.igeek.pojo.Maintain;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarMaintainController {

    @Autowired
    ICarMaintainService carMaintainService;

    @RequestMapping("/carDispatch/carMaintainApplication")
    public String carMaintainApplication(){
        return "dispatch/carMaintainApplication";
    }

    @RequestMapping("/carDispatch/carMaintainList")
    public String carMaintainList(Model model){
        List<Maintain> maintains = carMaintainService.selectAllMaintain();
        model.addAttribute("maintains",maintains);
        return "dispatch/carMaintainList";
    }


    @RequestMapping("/carDispatch/carMaintainAdd")
    public String carMaintainAdd(Maintain maintain){
        carMaintainService.addMaintain(maintain);
        return "redirect:/carDispatch/carMaintainList";
    }

    @ResponseBody
    @RequestMapping("/carDispatch/carMaintainDelete/{maintainno}")
    public ResultBean carMaintainDelete(@PathVariable(value = "maintainno")Integer id){
        int i = carMaintainService.deleteMaintainById(id);
        if(i>0){
            return new ResultBean(0,id,"删除成功");
        }
        return new ResultBean(500,id,"删除失败");
    }


    @RequestMapping("/carDispatch/carMaintainUpdate")
    public String carMaintainUpdate(Maintain maintain){
       carMaintainService.updateMaintain(maintain);
       return "redirect:/carDispatch/carMaintainList";
    }


    @RequestMapping("/carDispatch/carMaintainEdit/{maintainno}")
    public String carMaintainEdit(@PathVariable(value = "maintainno")Integer id,Model model){
        Maintain maintain = carMaintainService.selectMaintainById(id);
        model.addAttribute("maintain",maintain);
        return "dispatch/carMaintainEdit";
    }





}
