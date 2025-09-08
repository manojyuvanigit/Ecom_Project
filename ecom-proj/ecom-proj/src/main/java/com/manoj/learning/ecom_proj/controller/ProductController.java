package com.manoj.learning.ecom_proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome To Manoj ECom Website";
    }
}
