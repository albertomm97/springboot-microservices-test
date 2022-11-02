package com.projects.productservice.service;

import com.projects.productservice.persistence.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    public List<ProductEntity> getAllProducts();
    public void createProduct(ProductEntity product);
}
