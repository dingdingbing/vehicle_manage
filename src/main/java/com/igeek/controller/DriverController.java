package com.igeek.controller;

import com.igeek.pojo.Driver;
import com.igeek.pojo.ResultBean;
import com.igeek.pojo.User;
import com.igeek.service.IDriverService;
import com.igeek.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DriverController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IDriverService driverService;

    @RequestMapping("/driver/insert")
    public String addDriver(Driver driver) {
        System.out.println("insert===>" + driver.toString());
        int i = driverService.addDriver(driver);
        if (i > 0) {
            return "redirect:/driver";
        }
        return "error/500";
    }


    @RequestMapping("/driver/edit/{driverId}")
    public String edit(@PathVariable("driverId") Integer driverId, Model model) {
        Driver driver = driverService.selectDriverById(driverId);
        model.addAttribute("driver", driver);
        return "driver/driverEdit";
    }


    @RequestMapping("/driver/update")
    public String update(Driver driver) {
        System.out.println("update==>" + driver.toString());
        int i = driverService.updateDriver(driver);
        System.out.println("i===>" + i);
        if (i > 0) {
            return "redirect:/driver";
        }
        return "error/500";
    }


    @ResponseBody
    @RequestMapping("/driver/delete/{driverId}")
    public ResultBean delete(@PathVariable("driverId") Integer driverId) {
        int i = driverService.deleteDriverById(driverId);
        if (i > 0) {
            return new ResultBean(0, driverId, "删除成功");
        }
        return new ResultBean(500, driverId, "删除失败");
    }


    @RequestMapping("/tologin")
    public String tologin(String username, String password, Model model) {
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            return "index";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户不存在");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            return "login";
        } catch (LockedAccountException e) {
            model.addAttribute("msg", "当前用户被锁定，请联系管理员");
            return "login";
        }

    }


    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";
    }

    @RequestMapping("/register")
    public String register(User user, Model model) {
        System.out.println("进入注册了");
        user.setPassword(new SimpleHash("md5", user.getPassword(), user.getUsername(), 1024).toString());

        userService.registerUser(user);

        model.addAttribute("msg", "注册成功，请登录");
        System.out.println("注册成功了");
        return "redirect:/login";
    }


}
