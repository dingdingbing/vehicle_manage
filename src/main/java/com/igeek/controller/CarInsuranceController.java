package com.igeek.controller;

import com.igeek.pojo.Insurance;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarInsuranceController {

    @Autowired
    ICarInsuranceService carInsurance;

    @RequestMapping("/carDispatch/carInsuranceApplication")
    public String carInsuranceApp(){
        return "dispatch/carInsuranceApplication";
    }

    @RequestMapping("/carDispatch/carInsuranceList")
    public String carInsuranceList(Model model){
        List<Insurance> insurances = carInsurance.selectAllInsurance();
        model.addAttribute("insurances",insurances);
        return "dispatch/carInsuranceList";
    }

    @RequestMapping("/carDispatch/carInsuranceAdd")
    public String carInsuranceAdd(Insurance insurance){
        carInsurance.addInsurance(insurance);
        return "redirect:/carDispatch/carInsuranceList";
    }

    @ResponseBody
    @RequestMapping("/carDispatch/carInsuranceDelete/{insuranceno}")
    public ResultBean carInsuranceDelete(@PathVariable(value = "insuranceno")Integer id){
        System.out.println("进入删除了======>"+id);
        carInsurance.deleteInsuranceById(id);
        return new ResultBean(0,id,"删除成功");
    }

    @RequestMapping("/carDispatch/carInsuranceUpdate")
    public String carInsuranceUpdate(Insurance insurance){
        System.out.println("进入保险更新了"+insurance.toString());
        carInsurance.updateInsurance(insurance);
        return "redirect:/carDispatch/carInsuranceList";
    }

    @RequestMapping("/carDispatch/carInsuranceEdit/{insuranceno}")
    public String carInsuranceEdit(@PathVariable(value = "insuranceno")Integer id,Model model){
        Insurance insurance = carInsurance.selectInsuranceById(id);
        model.addAttribute("insurance",insurance);
        return "dispatch/carInsuranceEdit";
    }


}
