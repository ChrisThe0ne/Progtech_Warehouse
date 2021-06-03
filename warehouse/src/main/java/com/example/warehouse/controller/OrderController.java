package com.example.warehouse.controller;

import com.example.warehouse.controller.dto.*;
//import com.example.warehouse.dao.BuyRepository;
//import com.example.warehouse.dao.entity.User;
import com.example.warehouse.dao.entity.Orders;
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
public class OrderController {

    private final OrderService orderService;
    //private final SessionService sessionService;
    //private final BuyService buyService;

    @PostMapping(path = "/addOrder", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public void addOrder(OrderRecordRequest orderRequest, HttpServletResponse response) throws IOException {
        orderService.addOrder(orderRequest);
    }

    @GetMapping("/orderss")
    private List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @DeleteMapping(value = {"/deleteOrder/{orderId}"})
    public void delete(@PathVariable Integer orderId)
    {
        orderService.delete(orderId);
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