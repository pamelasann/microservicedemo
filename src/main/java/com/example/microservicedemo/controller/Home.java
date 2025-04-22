package com.example.microservicedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home{
    @GetMapping
    public String greet()
    {
        return "Home! try /greeting";
    }
}
