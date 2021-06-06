package com.example.warehouse.service;


import com.example.warehouse.controller.dto.SupplierRecordRequest;
import com.example.warehouse.dao.entity.Supplier;

import java.util.List;

public interface SupplierServiceInterface {


    void addSupplier(SupplierRecordRequest request);

    List<Supplier> getAllSuppliers();

    List<Supplier> getSupplierByName(String name);

    void  delete(Integer supplierId);
}
