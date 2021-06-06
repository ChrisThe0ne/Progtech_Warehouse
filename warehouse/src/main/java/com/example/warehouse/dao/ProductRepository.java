package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    List<Product> getAllByNameContaining(String name);

    Product getProductById(Integer guestId);

}
