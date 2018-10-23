package com.example.demo.webservice.web;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class webRestController {

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}
