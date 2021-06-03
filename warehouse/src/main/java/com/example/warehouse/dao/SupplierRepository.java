package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    /*
    Product getByName(String name);

    List<Product> getAllByCategory(String category);
    */
    List<Supplier> getAllByNameContaining(String name);

    Supplier getSupplierById(Integer supplierId);

}
