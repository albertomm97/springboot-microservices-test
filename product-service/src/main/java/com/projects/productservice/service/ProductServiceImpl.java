package com.projects.productservice.service;

import com.projects.productservice.persistence.entity.ProductEntity;
import com.projects.productservice.persistence.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public void createProduct(ProductEntity product) {
        this.productRepository.insert(product);
    }
}
