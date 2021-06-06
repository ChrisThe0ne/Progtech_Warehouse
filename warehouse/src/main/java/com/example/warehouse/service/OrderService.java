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
public class OrderService implements OrderServiceInterface{

    private final OrderRepository orderRepository;

    @Override
    public void addOrder(OrderRecordRequest request) {
        Orders orders = Orders.addOrder(request);
        orderRepository.save(orders);
    }

    @Override
    public List<Orders> getAllOrders() {
        return orderRepository.findAll().stream().map(Orders::toOrderRequest).collect(Collectors.toList());
    }


    @Override
    public void delete(Integer orderId) {
        Orders temp = orderRepository.getOrderById(orderId);
        orderRepository.delete(temp);
    }

}
