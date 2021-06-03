package com.example.warehouse.dao.entity;

import com.example.warehouse.controller.dto.OrderRecordRequest;
import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Orders {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Costumer costumer; //costumer_id mező lesz az adatbázisban

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product; //product_id mező lesz az adatbázisban

    private Integer quantity;

    private Integer cost;

    private Date date;

    private String address;

    public static Orders addOrder(OrderRecordRequest request) {
        return new Orders(
                0,
                request.getCostumer(),
                request.getProduct(),
                request.getQuantity(),
                request.getProduct().getPrice()* request.getQuantity(),
                request.getDate(),
                request.getAddress()
        );
    }

    public Orders toOrderRequest() {
        return new Orders(id, costumer, product, quantity, cost, date, address);
    }
}