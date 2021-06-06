package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> getAllByNameContaining(String name);

    Category getCategoryById(Integer categoryId);

    Category getCategoryByName(String name);

}