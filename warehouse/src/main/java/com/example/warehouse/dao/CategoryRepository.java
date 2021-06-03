package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    /*
    Product getByName(String name);

    List<Product> getAllByCategory(String category);
    */
    List<Category> getAllByNameContaining(String name);

    Category getCategoryById(Integer categoryId);

}