package com.example.warehouse.controller;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.entity.Costumer;
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
public class CostumerController {

    private final CostumerService costumerService;
    //private final SessionService sessionService;
    //private final BuyService buyService;

    @PostMapping(path = "/addCostumer", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public void addCostumer(CostumerRecordRequest costumerRequest, HttpServletResponse response) throws IOException {
        costumerService.addCostumer(costumerRequest);
    }

    @GetMapping("/costumers")
    private List<Costumer> getAllCostumers() {
        return costumerService.getAllCostumers();
    }

    @DeleteMapping(value = {"/deleteCostumer/{costumerId}"})
    public void delete(@PathVariable Integer costumerId)
    {
        costumerService.delete(costumerId);
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