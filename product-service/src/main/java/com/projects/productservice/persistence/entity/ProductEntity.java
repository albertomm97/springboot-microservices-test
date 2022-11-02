package com.projects.productservice.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(value = "products")
public class ProductEntity {

    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double price;
}
