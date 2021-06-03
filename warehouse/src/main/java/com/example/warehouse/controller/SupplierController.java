package com.example.warehouse.controller;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.entity.Supplier;
import com.example.warehouse.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SupplierController {

    private final SupplierService supplierService;
    //private final SessionService sessionService;
    //private final BuyService buyService;

    @PostMapping(path = "/addSupplier", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public void addsupplier(SupplierRecordRequest supplierRequest, HttpServletResponse response) throws IOException {
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

    /*
    @PostMapping("/category")
    private List<ProductRecordRequest> getProductsByCategory(@RequestParam MultiValueMap<String,String> paramMap){
        return productService.getProductsByCategory(paramMap.get("category").get(0));
    }

    @PostMapping("/productSearchResult")
    private List<ProductRecordRequest> getProductsByName(@RequestParam MultiValueMap<String,String> paramMap) {
        return productService.getProductsByCategory(paramMap.get("name").get(0));
    }
    */
}