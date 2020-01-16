package com.renitalobo.expense.controller;


import com.renitalobo.expense.model.Category;
import com.renitalobo.expense.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(value = "/categories")
    Collection<Category> categories(){
        return categoryRepository.findAll();
    }

    @GetMapping(value = "/category/{id}")
    Optional<Category> getCategory(@PathVariable Long id){
        return categoryRepository.findById(id);
    }


    @PostMapping(value = "/category")
    Category createCategory(@Valid @RequestBody Category category){
        return categoryRepository.save(category);
    }

    @PutMapping(value = "/category/{id}")
    Category updateCategory(@RequestBody Category category){
        return categoryRepository.save(category);
    }

    @DeleteMapping(value = "/category/{id}")
    void deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }

}
