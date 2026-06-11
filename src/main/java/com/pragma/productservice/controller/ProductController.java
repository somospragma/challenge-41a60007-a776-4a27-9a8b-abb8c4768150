package com.pragma.productservice.controller;

import com.pragma.productservice.domain.Product;
import com.pragma.productservice.infrastructure.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        if (product.getPrice() < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        if (productRepository.existsByName(product.getName())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(product));
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}