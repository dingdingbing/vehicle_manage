package com.igeek.controller;

import com.igeek.pojo.Inspection;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarInspectionController {

    @Autowired
    ICarInspectionService carInspectionService;

    @RequestMapping("/carDispatch/carInspectionList")
    public String carInspectionList(Model model){
        List<Inspection> inspections = carInspectionService.selectAllInspection();
        model.addAttribute("inspections",inspections);
        return "dispatch/carInspectionList";
    }

    @RequestMapping("/carDispatch/carInspectionApplication")
    public String carInspectionApp(){
        return "dispatch/carInspectionApplication";
    }


    @RequestMapping("/carDispatch/carInspectionAdd")
    public String carInspectionAdd(Inspection inspection){
        System.out.println(inspection.toString());
        carInspectionService.addInspection(inspection);
        return "redirect:/carDispatch/carInspectionList";
    }


    @RequestMapping("/carDispatch/carInspectionUpdate")
    public String carInspectionUpdate(Inspection inspection){
        int i = carInspectionService.updateInspection(inspection);
        return "redirect:/carDispatch/carInspectionList";
    }

    @ResponseBody
    @RequestMapping("/carDispatch/carInspectionDelete/{inspectionno}")
    public ResultBean carInspectionDelete(@PathVariable(value = "inspectionno") Integer id){
        int i = carInspectionService.deleteInspectionById(id);
        if(i>0){
            return new ResultBean(0,id,"删除成功");
        }
        return new ResultBean(500,id,"删除失败");
    }


    @RequestMapping("/carDispatch/carInspectionEdit/{inspectionno}")
    public String carInspectionEdit(@PathVariable(value = "inspectionno") Integer id,Model model){
        Inspection inspection = carInspectionService.selectInspectionById(id);
        model.addAttribute("inspection",inspection);
        return "dispatch/carInspectionEdit";
    }

}
