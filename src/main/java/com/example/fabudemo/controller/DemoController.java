package com.example.fabudemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("aaaaa01");
        System.out.println("123");
        return "jenkins测试成功！！！...";
    }


}
