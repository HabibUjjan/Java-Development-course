package com.student.ecommercebackend.controller;

import com.student.ecommercebackend.model.Product;
import com.student.ecommercebackend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController{
    private final ProductService service;
    public ProductController(ProductService service){ this.service=service; }

    @GetMapping
    public List<Product> getAll(){ return service.getAll(); }

    @PostMapping
    public Product add(@RequestBody Product p){ return service.addProduct(p); }

    @PutMapping("/{id}") public Product update(@PathVariable Long id, @RequestBody Product p){ return service.update(id,p); }

    @DeleteMapping("/{id}") public String delete(@PathVariable Long id){ service.delete(id); return "Deleted"; }
}
