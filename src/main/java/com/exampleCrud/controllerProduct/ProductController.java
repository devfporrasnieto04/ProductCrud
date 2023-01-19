package com.exampleCrud.controllerProduct;

import com.exampleCrud.exception.ResourceNotFoundException;
import com.exampleCrud.modelProduct.Product;
import com.exampleCrud.service.ProductServiceImp;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8060")
@RestController
@RequestMapping ("/app/v1/products")
@RequiredArgsConstructor
@Transactional
public class ProductController  {
    private final ProductServiceImp productServiceImp;
    @GetMapping("/list")
    public ResponseEntity <List<Product>> getAllProducts(){
            List <Product>productList = new ArrayList<>(productServiceImp.findAll());
            return new ResponseEntity<>(productList, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity <Product> findById (@PathVariable ("id") Integer id) {
            Product product = productServiceImp.findById(id).orElseThrow(()->
                    new ResourceNotFoundException(" Not found product with id = "+ id));
            return new ResponseEntity<>(product, HttpStatus.FOUND);
    }

    @PostMapping ("/add")
    public ResponseEntity<Product> addProduct ( @RequestBody Product product){
            Product _product = productServiceImp.save (new Product(
                    product.getId(),
                    product.getName(),
                    product.getCategory(),
                    product.getPrice()));
            return new ResponseEntity<>(_product, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct (@PathVariable ("id") Integer id,
                                  @RequestBody Product product) {
        Product product1 = productServiceImp.findById(id).orElseThrow(()->
                new ResourceNotFoundException(" Not found product with id = "+ id));
        productServiceImp.update(product, id);
        return new ResponseEntity<>(product, HttpStatus.OK);

    }
    @DeleteMapping  ("/delete/{id}")
    public ResponseEntity<Product> deleteProductById (@PathVariable ("id") Integer id) {
        Product product1 = productServiceImp.findById(id).orElseThrow(()->
                new ResourceNotFoundException(" Not found product with id = "+ id));
        productServiceImp.deleteById(id);
        return new ResponseEntity<>(product1, HttpStatus.OK);

    }

}
