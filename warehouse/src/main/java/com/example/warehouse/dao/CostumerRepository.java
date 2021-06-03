package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CostumerRepository extends JpaRepository<Costumer, Integer> {

    /*
    Product getByName(String name);

    List<Product> getAllByCategory(String category);
    */
    List<Costumer> getAllByNameContaining(String name);

    Costumer getCostumerById(Integer costumerId);

}