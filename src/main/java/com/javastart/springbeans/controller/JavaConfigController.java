package com.javastart.springbeans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaConfigController {

    @GetMapping("/java")
    public String hello(){

    }
}
