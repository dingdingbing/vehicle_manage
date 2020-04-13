package com.igeek.controller;

import com.igeek.pojo.Carapplication;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarApplicationController {

    @Autowired
    ICarApplicationService carApplicationService;

    @RequestMapping("car/carApplicationList")
    public String carApplicationTest(Model model){
        List<Carapplication> carapplications = carApplicationService.selectAllCarApp();
        model.addAttribute("carapplications",carapplications);
        return "car/carApplicationList";
    }

    @RequestMapping("car/carApplication")
    public String carApplication(){
        return "car/carApplicationTest";
    }

    @RequestMapping("car/carApplicationEdit/{applicationno}")
    public String carApplicationEdit(@PathVariable(value = "applicationno") Integer applicationno,Model model){
        Carapplication carapplication = carApplicationService.selectCarByAppNo(applicationno);
        model.addAttribute("carApplication",carapplication);
        return "car/carApplicationEdit";
    }

    @RequestMapping("car/carApplicationUpdate")
    public String carApplicationUpdate(Carapplication carapplication){
        carApplicationService.updateCarApplication(carapplication);
        return "redirect:/car/carApplicationList";
    }

    @ResponseBody
    @RequestMapping("car/carApplicationDelete/{applicationno}")
    public ResultBean carApplicationDelete(@PathVariable(value = "applicationno") Integer applicationno){
        carApplicationService.deleteCarApplicationById(applicationno);
        return new ResultBean(0,applicationno,"删除成功");
    }




    @RequestMapping("car/carApplicationAdd")
    public String carApplicationAdd(Carapplication carapplication){
        carApplicationService.addCarApplication(carapplication);
        return "redirect:/car/carApplicationList";
    }

}
