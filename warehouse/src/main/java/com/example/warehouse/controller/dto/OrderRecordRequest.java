package com.example.warehouse.controller.dto;

import com.example.warehouse.dao.entity.Costumer;
import com.example.warehouse.dao.entity.Product;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@Data
@AllArgsConstructor
public class OrderRecordRequest {

    @NonNull
    @ApiModelProperty(required = true)
    private Costumer costumer;

    @NonNull
    @ApiModelProperty(required = true)
    private Product product;

    @NonNull
    @ApiModelProperty(required = true, example = "99")
    private int quantity;

    @NonNull
    @ApiModelProperty(required = true, example = "9999")
    private int cost;

    @NonNull
    @ApiModelProperty(required = true, example = "2021-05-24")
    private Date date;

    @NonNull
    @ApiModelProperty(required = true, example = "Test address")
    private String address;
}

