package com.projects.productservice.persistence.repository;

import com.projects.productservice.persistence.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
