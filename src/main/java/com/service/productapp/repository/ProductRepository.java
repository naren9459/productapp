package com.service.productapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.service.productapp.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
