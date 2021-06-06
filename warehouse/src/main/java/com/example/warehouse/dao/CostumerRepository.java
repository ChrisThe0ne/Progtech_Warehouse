package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CostumerRepository extends JpaRepository<Costumer, Integer> {

    List<Costumer> getAllByNameContaining(String name);

    Costumer getCostumerById(Integer costumerId);

    Costumer getCostumerByName(String name);

}