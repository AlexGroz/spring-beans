package com.javastart.springbeans.service;

public class HelloXmlService {

    private UtilsService utilsService;

    public String hello(){
        return "Hello from xml!";
    }

    public void setUtilsService(UtilsService utilsService) {
        this.utilsService = utilsService;
    }
}
