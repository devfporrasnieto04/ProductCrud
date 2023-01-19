package com.exampleCrud.modelProduct;

import jakarta.persistence.*;
import lombok.*;
@Builder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column (name = "name")
    private String name;
    @Column (name = "category")
    private String category;
    @Column (name = "price")
    private double price;
}
