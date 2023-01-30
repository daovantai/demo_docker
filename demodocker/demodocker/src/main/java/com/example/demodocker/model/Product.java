package com.example.demodocker.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;

    public Product(Long id, String name, int price) {
        this.id=id;
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}