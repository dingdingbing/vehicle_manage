package com.igeek.controller;

import com.igeek.pojo.Carlocation;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarLocationController {

    @Autowired
    ICarLocationService service;

    @ResponseBody
    @RequestMapping("/car/location")
    public ResultBean list(){
        List<Carlocation> list = service.list();
        if (list!=null){
            return new ResultBean(0,list,"查询成功");
        }else {
            return new ResultBean(200,null,"查询失败");
        }

    }

}
