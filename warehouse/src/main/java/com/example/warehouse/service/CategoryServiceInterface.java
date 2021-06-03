package com.example.warehouse.service;


import com.example.warehouse.controller.dto.CategoryRecordRequest;
import com.example.warehouse.dao.entity.Category;

import java.util.List;

public interface CategoryServiceInterface {


    void addCategory(CategoryRecordRequest request);

    List<Category> getAllCategories();

    List<Category> getCategoriesByName(String name);

    //List<CategoryRecordRequest> getProductsByCategory(String category);

    void  delete(Integer categoryId);

    /*

    void addRating(RatingRecordRequest request, User user);
    */
}
