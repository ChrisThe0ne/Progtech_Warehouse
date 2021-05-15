package com.example.warehouse.service;


import com.example.warehouse.controller.dto.ProductRecordRequest;
import com.example.warehouse.dao.entity.Product;

import java.util.List;

public interface ProductServiceInterface {


    void addProduct(ProductRecordRequest request);

    List<Product> getAllProducts();

    List<Product> getProductsByName(String name);

    List<ProductRecordRequest> getProductsByCategory(String category);

    void  delete(Integer productId);

    /*

    void addRating(RatingRecordRequest request, User user);
    */
}
