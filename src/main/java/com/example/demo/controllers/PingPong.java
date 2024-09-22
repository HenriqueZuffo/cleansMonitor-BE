package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPong {

    @GetMapping("Ping")
    public String ping(){
        return "pong";
    }
}
