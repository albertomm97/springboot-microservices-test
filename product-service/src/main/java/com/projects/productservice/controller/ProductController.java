package com.projects.productservice.controller;

import com.projects.productservice.persistence.entity.ProductEntity;
import com.projects.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProducts());
    }

    @PostMapping()
    public ResponseEntity<Void> createProduct(@RequestBody ProductEntity productEntity) {
        this.productService.createProduct(productEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
