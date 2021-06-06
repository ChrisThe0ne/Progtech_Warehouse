package com.example.warehouse.service;

import com.example.warehouse.controller.dto.CostumerRecordRequest;
import com.example.warehouse.dao.CostumerRepository;
import com.example.warehouse.dao.entity.Costumer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
class CostumerServiceTest {

    @Resource
    private CostumerService costumerService;

    @Resource
    private CostumerRepository costumerRepository;
    @Test
    void addCostumer() {

        Costumer expectedCostumer = new Costumer();
        expectedCostumer.setName("Teszt Elek");
        expectedCostumer.setEmail("teszt@email.com");
        expectedCostumer.setPhone("06201234567");

        CostumerRecordRequest costumerRequest = new CostumerRecordRequest(
                "Teszt Elek",
                "teszt@email.com",
                "06201234567"
        );

        costumerService.addCostumer(costumerRequest);

        Costumer actualCostumer = costumerRepository.getCostumerByName("Teszt Elek");
        assertNotNull(actualCostumer);
        assertEquals(expectedCostumer.getName(), actualCostumer.getName());
        assertEquals(expectedCostumer.getEmail(), actualCostumer.getEmail());
        assertEquals(expectedCostumer.getPhone(), actualCostumer.getPhone());

    }
}