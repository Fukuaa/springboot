package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Controller
public class hello {
    @RequestMapping("/hello")
    public String t(Model model){
        model.addAttribute("users", Arrays.asList("zqf","zqq"));
        return "t";
    }
}
