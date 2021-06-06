package com.example.warehouse.service;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.*;
import com.example.warehouse.dao.entity.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SupplierService implements SupplierServiceInterface{

    private final SupplierRepository supplierRepository;

    @Override
    public void addSupplier(SupplierRecordRequest request) {
        Supplier supplier = Supplier.addSupplier(request);
        supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll().stream().map(Supplier::toSupplierRequest).collect(Collectors.toList());
    }

    @Override
    public List<Supplier> getSupplierByName(String name) {
        return supplierRepository.getAllByNameContaining(name).stream().map(Supplier::toSupplierRequest).collect(Collectors.toList());
    }


    @Override
    public void delete(Integer supplierId) {
        Supplier temp = supplierRepository.getSupplierById(supplierId);
        supplierRepository.delete(temp);
    }



}
