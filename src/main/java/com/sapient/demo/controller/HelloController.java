package com.sapient.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "<center><h1>Hello, Welcome to Avinsh Dashboard!</h1> </center>";
    }
}
