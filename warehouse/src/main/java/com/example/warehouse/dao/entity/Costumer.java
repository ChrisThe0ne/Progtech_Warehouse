package com.example.warehouse.dao.entity;

import com.example.warehouse.controller.dto.CostumerRecordRequest;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Costumer {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String phone;

    private String email;

    public static Costumer addCostumer(CostumerRecordRequest request) {
        return new Costumer(
                0,
                request.getName(),
                request.getPhone(),
                request.getEmail()
        );
    }

    public Costumer toCostumerRequest() {
        return new Costumer(id, name,phone, email);
    }
}