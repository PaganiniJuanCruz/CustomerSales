package com.customersales.customerSales.controller;


import com.customersales.customerSales.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("sales")
public class ProductController {
    @GetMapping("/all")
    List<Product> all(){
        return Arrays.asList(
                new Product(1, "Shoes", "Nike", 8)
        );
    }

    @PostMapping("/newSale")
    Product save(@RequestBody Product product){
        return save(product);
    }
}
