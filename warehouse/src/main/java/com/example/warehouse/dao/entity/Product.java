package com.example.warehouse.dao.entity;

import com.example.warehouse.controller.dto.ProductRecordRequest;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String category;

    private Integer price;

    private Integer quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    private Supplier supplier; //supplier_id mező lesz az adatbázisban

    private String description;

    public static Product addProduct(ProductRecordRequest request) {
        return new Product(
                0,
                request.getName(),
                request.getCategory(),
                request.getPrice(),
                request.getQuantity(),
                request.getSupplier(),
                request.getDescription()
        );
    }

    public Product toProductRequest() {
        return new Product(id, name,category, price, quantity, supplier, description);
    }
}