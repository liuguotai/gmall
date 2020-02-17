package com.example.gamll.user.controller;

import com.example.gamll.user.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserManageController {

    @Autowired
    UserManageService userManageService;


    @RequestMapping("index")
    @ResponseBody
    public String index(){
       return  "index  user------------";
    }


}
