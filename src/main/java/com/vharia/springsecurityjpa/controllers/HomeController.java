package com.vharia.springsecurityjpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "<h1> Hi, this page can be accessed by anyone </h1>";
    }

    @GetMapping("/user")
    public String getUser(){
        return "<h1> Hi, this page can be accessed by only USER & ADMIN </h1>";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "<h1> Hi, this page can be accessed by ADMIN </h1>";
    }
}