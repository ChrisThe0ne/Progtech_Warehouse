package com.example.warehouse.dao.entity;

import com.example.warehouse.controller.dto.CategoryRecordRequest;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public static Category addCategory(CategoryRecordRequest request) {
        return new Category(
                0,
                request.getName()
        );
    }

    public Category toCategoryRequest() {
        return new Category(id, name);
    }
}