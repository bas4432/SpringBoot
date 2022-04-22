package com.example.springboot.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @PostMapping(value = "/company/{id}")
    public String first(@RequestParam("id") String id){

        return "hello World";
        //feat
    }



}
