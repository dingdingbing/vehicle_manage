package com.igeek.controller;

import com.igeek.pojo.Car;
import com.igeek.pojo.Carapplication;
import com.igeek.pojo.ResultBean;
import com.igeek.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private ICarService carService;

    @RequestMapping("car/carList")
    public String carList(Model model){
        List<Car> cars = carService.selectAllCar();
        model.addAttribute("cars",cars);
        return "car/carList";
    }

    @RequestMapping("car/carEdit/{carno}")
    public String carEdit(@PathVariable("carno") Integer carno,Model model){
        Car car = carService.selectCarById(carno);
        System.out.println("car======>"+car.toString());
        model.addAttribute("car",car);
        return "car/carEdit";
    }

    @RequestMapping("car/carListTest")
    public String carListTest(Model model){
        List<Car> cars = carService.selectAllCar();
        model.addAttribute("cars",cars);
        return "car/carListTest";
    }

    @RequestMapping("car/register")
    public String carRegister(){
        return "car/carRegister";
    }

    @ResponseBody
    @RequestMapping("car/add")
    public ResultBean carAdd(Car car){
        System.out.println(car.toString());
        carService.addCar(car);
        return new ResultBean(0,car.getCarno(),"新增成功");
    }

    @ResponseBody
    @RequestMapping("car/update")
    public ResultBean carUpdate(Car car){
        System.out.println("进入car/update了 car======>"+car.toString());
        int i = carService.updateCar(car);
        return new ResultBean(0,car.getCarno(),"修改车辆信息成功");
    }




}
