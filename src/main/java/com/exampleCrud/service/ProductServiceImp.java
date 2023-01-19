package com.exampleCrud.service;

import com.exampleCrud.modelProduct.Product;
import com.exampleCrud.productRepository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService{
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        return productRepository.findAll();
    }

    public Optional<Product> findById(Integer id){
        return productRepository.findById(id);
    }

    public Product save (Product product){
        return productRepository.save(product);
    }
    public Product update(Product product, Integer id){
        Product product1 = productRepository.findById(id).get();
        product1.setId(product.getId());
        product1.setName(product.getName());
        product1.setCategory(product.getCategory());
        product1.setPrice(product.getPrice());

        productRepository.save(product1);
        return productRepository.findById(product1.getId()).get();
    }

    public void deleteById (Integer id){
        productRepository.deleteById(id);
    }
}
