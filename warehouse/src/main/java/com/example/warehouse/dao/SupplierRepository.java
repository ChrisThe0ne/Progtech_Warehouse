package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {


    List<Supplier> getAllByNameContaining(String name);

    Supplier getSupplierById(Integer supplierId);

    Supplier getSupplierByName(String name);

}
