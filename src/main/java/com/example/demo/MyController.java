package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    @GetMapping("/sayhi")
    public String fMethod(){

        return "hi";

    }

}
