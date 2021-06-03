package com.example.warehouse.dao;


import com.example.warehouse.dao.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

    /*
    Product getByName(String name);

    List<Product> getAllByCategory(String category);

    List<Order> getAllByNameContaining(String name);
*/

    Orders getOrderById(Integer orderId);

}
