package com.tempspring.firstseminar.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }
}
