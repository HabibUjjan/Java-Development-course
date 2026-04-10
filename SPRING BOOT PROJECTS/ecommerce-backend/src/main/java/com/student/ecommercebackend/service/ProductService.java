package com.student.ecommercebackend.service;

import com.student.ecommercebackend.model.Product;
import com.student.ecommercebackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{
    private final ProductRepository repo;
    public ProductService(ProductRepository repo){ this.repo=repo; }

    public Product addProduct(Product p){ return repo.save(p); }
    public List<Product> getAll(){ return repo.findAll(); }
    public Product update(Long id, Product p){
        Product prod=repo.findById(id).orElseThrow();
        prod.setName(p.getName()); prod.setDescription(p.getDescription());
        prod.setPrice(p.getPrice()); prod.setStock(p.getStock());
        return repo.save(prod);
    }
    public void delete(Long id){ repo.deleteById(id); }
}