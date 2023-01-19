package com.exampleCrud.productRepository;

import com.exampleCrud.modelProduct.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product, Integer>{
}
