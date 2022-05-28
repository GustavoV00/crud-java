package com.self.crud.services;

import java.util.List;
import java.util.Optional;

import com.self.crud.entities.Product;
import com.self.crud.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(int id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }

}
