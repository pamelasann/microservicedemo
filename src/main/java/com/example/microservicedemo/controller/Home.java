/* (C)2025 */
package com.example.microservicedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {
    @GetMapping
    public String home() {
        return "Home! try /greeting";
    }
}
