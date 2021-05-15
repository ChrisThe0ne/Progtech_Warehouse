package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    /*
    Product getByName(String name);

    List<Product> getAllByCategory(String category);
    */
    List<Product> getAllByNameContaining(String name);

}
