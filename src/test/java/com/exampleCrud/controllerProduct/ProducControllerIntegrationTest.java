package com.exampleCrud.controllerProduct;

import com.exampleCrud.modelProduct.Product;
import com.exampleCrud.productRepository.ProductRepository;
import com.exampleCrud.service.ProductService;
import com.exampleCrud.service.ProductServiceImp;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = ProductController.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
public class ProducControllerIntegrationTest {
  @Autowired
  private  ProductRepository productRepository;
  @Autowired
  private ProductController productController;
  @Autowired
  private  ProductServiceImp productServiceImp;
  @Autowired
  private ProductService productService;






}
