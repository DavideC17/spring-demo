package com.antsrl.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/hello")
    public String helloworld() {
        return "hello world";
    }

    @GetMapping(value = "/anotherHello")
    public String anotherHello() {
        return "another hello world";
    }

}
