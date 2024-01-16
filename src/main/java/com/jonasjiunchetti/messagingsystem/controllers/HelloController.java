package com.jonasjiunchetti.messagingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonasjiunchetti.messagingsystem.services.HelloProducer;

@RestController
@RequestMapping("/kafka")
public class HelloController {
    
    @Autowired
    private HelloProducer service;

    @GetMapping("/hello/{name}")
    public String hello (@PathVariable("name") String name)  {
        service.sendMessage("Hello, " + name);
        return "OK";
    }

}
