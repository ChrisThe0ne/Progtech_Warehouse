package com.example.warehouse.service;

import com.example.warehouse.controller.dto.CostumerRecordRequest;
import com.example.warehouse.controller.dto.SupplierRecordRequest;
import com.example.warehouse.dao.CostumerRepository;
import com.example.warehouse.dao.SupplierRepository;
import com.example.warehouse.dao.entity.Costumer;
import com.example.warehouse.dao.entity.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
class SupplierServiceTest {

    @Resource
    private SupplierService supplierService;

    @Resource
    private SupplierRepository supplierRepository;
    @Test
    void addSupplier() {
        Supplier expectedSupplier = new Supplier();
        expectedSupplier.setName("Teszt Supplier");
        expectedSupplier.setAddress("teszt address 24.");
        expectedSupplier.setDescription("Teszt Leiras");

        SupplierRecordRequest supplierRequest = new SupplierRecordRequest(
                "Teszt Supplier",
                "teszt address 24.",
                "Teszt Leiras"
        );

        supplierService.addSupplier(supplierRequest);

        Supplier actualSupplier = supplierRepository.getSupplierByName("Teszt Supplier");
        assertNotNull(actualSupplier);
        assertEquals(expectedSupplier.getName(), actualSupplier.getName());
        assertEquals(expectedSupplier.getAddress(), actualSupplier.getAddress());
        assertEquals(expectedSupplier.getDescription(), actualSupplier.getDescription());
    }
}