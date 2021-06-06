package com.example.warehouse.service;

import com.example.warehouse.controller.dto.CategoryRecordRequest;
import com.example.warehouse.controller.dto.CostumerRecordRequest;
import com.example.warehouse.dao.CategoryRepository;
import com.example.warehouse.dao.CostumerRepository;
import com.example.warehouse.dao.entity.Category;
import com.example.warehouse.dao.entity.Costumer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
class CategoryServiceTest {

    @Resource
    private CategoryService categoryService;

    @Resource
    private CategoryRepository categoryRepository;

    @Test
    void addCategory() {
        Category expectedCategory = new Category();
        expectedCategory.setName("Teszt kategória");

        CategoryRecordRequest categoryRequest = new CategoryRecordRequest(
                "Teszt kategória"
        );

        categoryService.addCategory(categoryRequest);

        Category actualCategory = categoryRepository.getCategoryByName("Teszt kategória");
        assertNotNull(actualCategory);
        assertEquals(expectedCategory.getName(), actualCategory.getName());
    }
}