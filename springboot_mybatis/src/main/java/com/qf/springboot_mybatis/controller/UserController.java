package com.qf.springboot_mybatis.controller;

import com.qf.springboot_mybatis.entity.TUser;
import com.qf.springboot_mybatis.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


/**
 * @author Oulingcheng
 * @Date 2019/7/29
 */
@Controller
@RequestMapping("user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @GetMapping("queryUser")
    public String queryUser(@Valid TUser user, Model model){
        System.out.println(user.toString());
        model.addAttribute("users",user);
        return "usermessage";
    }

    @GetMapping("submit")
    public String submit(){
        logger.error("error.......");
        return "hello";
    }


}
