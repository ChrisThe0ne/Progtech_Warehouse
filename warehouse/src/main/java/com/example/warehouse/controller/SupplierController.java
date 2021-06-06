package com.example.warehouse.controller;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.entity.Supplier;
import com.example.warehouse.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SupplierController {

    private final SupplierService supplierService;

    @PostMapping(path = "/addSupplier", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public void addsupplier(SupplierRecordRequest supplierRequest) throws IOException {
        supplierService.addSupplier(supplierRequest);
    }

    @GetMapping("/suppliers")
    private List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @DeleteMapping(value = {"/deleteSupplier/{supplierId}"})
    public void delete(@PathVariable Integer supplierId)
    {
        supplierService.delete(supplierId);
    }

}