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
public class CostumerService implements CostumerServiceInterface{

    private final CostumerRepository costumerRepository;

    @Override
    public void addCostumer(CostumerRecordRequest request) {
        /*
        Optional.ofNullable(productRepository.getByName(request.getName())).ifPresent(product ->
                {throw new RuntimeException(String.format("%s termék név már foglalt ", product.getName()));}
        );
        */

        Costumer costumer = Costumer.addCostumer(request);
        costumerRepository.save(costumer);
    }

    @Override
    public List<Costumer> getAllCostumers() {
        return costumerRepository.findAll().stream().map(Costumer::toCostumerRequest).collect(Collectors.toList());
    }

    @Override
    public List<Costumer> getCostumersByName(String name) {
        return costumerRepository.getAllByNameContaining(name).stream().map(Costumer::toCostumerRequest).collect(Collectors.toList());
    }


    @Override
    public void delete(Integer costumerId) {
        Costumer temp = costumerRepository.getCostumerById(costumerId);
        costumerRepository.delete(temp);
    }

}
