package com.example.warehouse.controller.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
public class ProductRecordRequest {

    @NonNull
    @ApiModelProperty(required = true, example = "Test product")
    private String name;

    @NonNull
    @ApiModelProperty(required = true, example = "Test category")
    private String category;

    @NonNull
    @ApiModelProperty(required = true, example = "9999")
    private int price;

    @NonNull
    @ApiModelProperty(required = true, example = "99")
    private int quantity;

    @NonNull
    @ApiModelProperty(required = true, example = "Test description")
    private String description;
}
