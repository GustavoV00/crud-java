package com.self.crud.services;

import java.util.List;
import java.util.Optional;

import com.self.crud.entities.Category;
import com.self.crud.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository orderRepository;

    public CategoryService(CategoryRepository orderRepository) {
        super();
        this.orderRepository = orderRepository;
    }

    public List<Category> findAll() {
        return orderRepository.findAll();
    }

    public Category findById(int id) {
        Optional<Category> obj = orderRepository.findById(id);
        return obj.get();
    }

}
