package com.example.warehouse.dao.entity;

import com.example.warehouse.controller.dto.SupplierRecordRequest;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Supplier {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String address;

    private String description;

    public static Supplier addSupplier(SupplierRecordRequest request) {
        return new Supplier(
                0,
                request.getName(),
                request.getAddress(),
                request.getDescription()
        );
    }

    public Supplier toSupplierRequest() {
        return new Supplier(id, name, address, description);
    }

}