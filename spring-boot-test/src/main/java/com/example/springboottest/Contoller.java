package com.example.springboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
    
    @GetMapping("/test")
    public double test(){
        return Math.random();
    }
}