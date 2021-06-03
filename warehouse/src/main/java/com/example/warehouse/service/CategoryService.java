package com.example.warehouse.service;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.*;
import com.example.warehouse.dao.entity.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService implements CategoryServiceInterface{

    private final CategoryRepository categoryRepository;

    @Override
    public void addCategory(CategoryRecordRequest request) {
        /*
        Optional.ofNullable(productRepository.getByName(request.getName())).ifPresent(product ->
                {throw new RuntimeException(String.format("%s termék név már foglalt ", product.getName()));}
        );
        */

        Category category = Category.addCategory(request);
        categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll().stream().map(Category::toCategoryRequest).collect(Collectors.toList());
    }

    @Override
    public List<Category> getCategoriesByName(String name) {
        return categoryRepository.getAllByNameContaining(name).stream().map(Category::toCategoryRequest).collect(Collectors.toList());
    }


    @Override
    public void delete(Integer categoryId) {
        Category temp = categoryRepository.getCategoryById(categoryId);
        categoryRepository.delete(temp);
    }

}
