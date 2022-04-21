package com.example.springdemoapp.controllers;

import com.example.springdemoapp.models.DemoModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/hello")
    public  DemoModel hello(){
           return DemoModel.builder()
                   .name("Sumit")
                   .score(100)
                   .value(10.5f)
                   .build();
    }

    @PostMapping("/echo")
    public DemoModel echo(@RequestBody DemoModel demoModel){
        return demoModel;
    }

}
