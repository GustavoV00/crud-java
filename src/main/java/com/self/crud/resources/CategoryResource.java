package com.self.crud.resources;

import java.util.List;

import com.self.crud.entities.Category;
import com.self.crud.services.CategoryService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    private CategoryService categoryService;

    public CategoryResource(CategoryService categoryService) {
        super();
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categorys = categoryService.findAll();
        return ResponseEntity.ok().body(categorys);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable int id) {
        Category obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);

    }
}