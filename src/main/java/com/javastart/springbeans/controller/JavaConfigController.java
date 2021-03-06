package com.javastart.springbeans.controller;

import com.javastart.springbeans.service.JavaConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaConfigController {

    private final JavaConfigService javaConfigService;

    @Autowired
    public JavaConfigController(JavaConfigService javaConfigService){
        this.javaConfigService = javaConfigService;
    }

    @GetMapping("/java")
    public String hello(){
        return javaConfigService.hello();
    }
}
