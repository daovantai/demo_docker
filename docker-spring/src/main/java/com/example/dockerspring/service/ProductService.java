package com.example.dockerspring.service;


import com.example.dockerspring.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAll();

    Product getProductById(Long id);
}
