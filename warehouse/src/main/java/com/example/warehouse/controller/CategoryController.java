package com.example.warehouse.controller;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.entity.Category;
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
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping(path = "/addCategory", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public void addCategory(CategoryRecordRequest categoryRequest, HttpServletResponse response) throws IOException {
        categoryService.addCategory(categoryRequest);
    }

    @GetMapping("/categories")
    private List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @DeleteMapping(value = {"/deleteCategory/{categoryId}"})
    public void delete(@PathVariable Integer categoryId)
    {
        categoryService.delete(categoryId);
    }

}