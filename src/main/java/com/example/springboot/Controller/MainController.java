package com.example.springboot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/main")
    public String first(){

        return "hello World";
    }
}
