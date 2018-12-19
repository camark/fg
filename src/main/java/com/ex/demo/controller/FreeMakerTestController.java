package com.ex.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/FreeMaker")
public class FreeMakerTestController {

    @RequestMapping("/hi")
    public String hi(Model model){
        model.addAttribute("msg","Hello FreeMarker!");

        return "FreeMaker/hi";
    }
}
