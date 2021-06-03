package com.example.warehouse.service;


import com.example.warehouse.controller.dto.OrderRecordRequest;
import com.example.warehouse.dao.entity.Orders;

import java.util.List;

public interface OrderServiceInterface {


    void addOrder(OrderRecordRequest request);

    List<Orders> getAllOrders();

    //List<Order> getCostumersByName(String name);

    //List<CategoryRecordRequest> getProductsByCategory(String category);

    void  delete(Integer orderId);

    /*

    void addRating(RatingRecordRequest request, User user);
    */
}
