package com.example.warehouse.service;


import com.example.warehouse.controller.dto.OrderRecordRequest;
import com.example.warehouse.dao.entity.Orders;

import java.util.List;

public interface OrderServiceInterface {


    void addOrder(OrderRecordRequest request);

    List<Orders> getAllOrders();

    void  delete(Integer orderId);
}
