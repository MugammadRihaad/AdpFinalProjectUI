package com.howtodoinjava.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


public class IndexController {
    @GetMapping("/")
    @ResponseBody
    public String homePage() {
        return " Home ";
    }

}