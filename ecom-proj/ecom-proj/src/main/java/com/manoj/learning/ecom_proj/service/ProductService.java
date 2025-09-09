package com.manoj.learning.ecom_proj.service;

import com.manoj.learning.ecom_proj.model.Product;
import com.manoj.learning.ecom_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProducts(){
        List<Product> productList =  productRepository.findAll();
        for(Product prod: productList){
            System.out.println(prod);
        }
        return productRepository.findAll();
    }

}
