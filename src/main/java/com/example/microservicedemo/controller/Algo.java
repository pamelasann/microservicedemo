package com.example.microservicedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/algo")
public class Algo 
{
    @GetMapping
    public String algo() {
        return "ALGO";
    }
}
