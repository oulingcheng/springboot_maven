package com.qf.springboot_hello.controller;

import com.qf.springboot_hello.entity.User;
import com.qf.springboot_hello.resource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author Oulingcheng
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private Resource resource;

    @GetMapping("properties")
    public String resource(){
        return resource.getEmailServer()+":"+resource.getImageServer();
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello world!!!hello java!!!";
    }

    @GetMapping("page/{pageIndex}")
    public String pageRestful(@PathVariable(name = "pageIndex") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @PostMapping("users")
    public User usermessage(User user){
        //user.setDate(new Date());
        return user;
    }
}
