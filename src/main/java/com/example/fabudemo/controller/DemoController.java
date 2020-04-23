package com.example.fabudemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("aaaaa");
        return "测试成功！";
    }


}
