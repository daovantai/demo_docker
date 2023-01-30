package com.example.demodocker.service;



import com.example.demodocker.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAll();

    Product getProductById(Long id);
}
