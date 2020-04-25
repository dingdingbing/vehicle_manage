package com.igeek.controller;

import com.igeek.pojo.Driver;
import com.igeek.service.IDriverService;
import com.igeek.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//页面跳转Controller
@Controller
public class PageController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IDriverService driverService;

    @RequestMapping({"/index","/index.html"})
    public String toIndex(Model model){
        model.addAttribute("msg","hello,shiro");
        return "index";
    }

    @RequestMapping("/driver/add")
    public String add(){
        return "driver/driverAdd";
    }

    @RequestMapping({"/login","/","/login.html"})
    public String login(){
        return "login";
    }

    @RequestMapping("/unauthorized")
    @ResponseBody
    public String unauthorized(){
        return "未授权无法访问该页面";
    }

    @RequestMapping("/toregister")
    public String toregister(){

        return "register";
    }

    @RequestMapping("/tables")
    public String tables(Model model){
        List<Driver> drivers = driverService.selectAllDriver();
        model.addAttribute("drivers",drivers);
        return "tables";
    }

    @RequestMapping("/driver")
    public String driverList(Model model){
        List<Driver> drivers = driverService.selectAllDriver();
        model.addAttribute("drivers",drivers);
        return "driver/driverList";
    }


    @RequestMapping("/carTest")
    public String carTest(){
        return "car/carTest";
    }

}
