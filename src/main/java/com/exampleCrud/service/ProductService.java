package com.exampleCrud.service;

import com.exampleCrud.modelProduct.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Product save (Product product);
    Optional<Product>findById(Integer id);
    void deleteById(Integer id);
    Product update(Product product, Integer id);
}
