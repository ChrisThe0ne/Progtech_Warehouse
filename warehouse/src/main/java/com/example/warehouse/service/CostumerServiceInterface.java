package com.example.warehouse.service;


import com.example.warehouse.controller.dto.CostumerRecordRequest;
import com.example.warehouse.dao.entity.Costumer;

import java.util.List;

public interface CostumerServiceInterface {


    void addCostumer(CostumerRecordRequest request);

    List<Costumer> getAllCostumers();

    List<Costumer> getCostumersByName(String name);

    void  delete(Integer costumerId);
}
