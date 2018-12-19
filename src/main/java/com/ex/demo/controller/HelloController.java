package com.ex.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {


    @RequestMapping("/index")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return "Hello "+name;
    }
}
