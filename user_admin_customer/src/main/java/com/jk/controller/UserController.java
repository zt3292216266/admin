package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;
@Controller
@RequestMapping("app/user")
public class UserController {


    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("queryUser")
    public List queryUser(){

        List<User> list =  userService.queryUser();
        System.out.println("这是controller");
        return list;
    }
}
