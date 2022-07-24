package com.necatisahiin.springsecuritybasicauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomController {

    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }

    @RequestMapping("/logout")
    public String logoutPage() {
        return "logout-success.jsp";
    }

    @RequestMapping("/home")
    public String homePage() {
        return "home.jsp";
    }
}


