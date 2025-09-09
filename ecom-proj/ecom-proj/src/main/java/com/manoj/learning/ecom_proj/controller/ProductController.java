package com.manoj.learning.ecom_proj.controller;

import com.manoj.learning.ecom_proj.model.Product;
import com.manoj.learning.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public List<Product> welcome(){
        return productService.getAllProducts();
    }
}
