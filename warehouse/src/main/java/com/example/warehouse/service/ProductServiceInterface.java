package com.example.warehouse.service;


import com.example.warehouse.controller.dto.ProductRecordRequest;

import java.util.List;

public interface ProductServiceInterface {


    void addProduct(ProductRecordRequest request);

    List<ProductRecordRequest> getAllProducts();

    List<ProductRecordRequest> getProductsByName(String name);

    List<ProductRecordRequest> getProductsByCategory(String category);

    /*

    void addRating(RatingRecordRequest request, User user);
    */
}
