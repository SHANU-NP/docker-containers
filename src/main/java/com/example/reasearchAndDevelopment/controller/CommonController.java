package com.example.reasearchAndDevelopment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommonController {


    @GetMapping("/message")
    public String greetingMessage(){
        return "Hello world";
    }
}
