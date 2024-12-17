package com.demo.mongodb.repository;

import com.demo.mongodb.dto.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

    //custom db queries
}
