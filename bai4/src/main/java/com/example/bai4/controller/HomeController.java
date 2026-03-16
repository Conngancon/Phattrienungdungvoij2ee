package com.example.bai4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // custom login page mapping (Spring Security will redirect here when authentication is required)
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
