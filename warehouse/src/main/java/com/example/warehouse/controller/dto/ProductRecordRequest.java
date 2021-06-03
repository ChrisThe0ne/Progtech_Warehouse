package com.example.warehouse.controller.dto;

import com.example.warehouse.dao.entity.Category;
import com.example.warehouse.dao.entity.Supplier;
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
    @ApiModelProperty(required = true)
    private Category category;

    @NonNull
    @ApiModelProperty(required = true, example = "9999")
    private int price;

    @NonNull
    @ApiModelProperty(required = true, example = "99")
    private int quantity;

    @NonNull
    @ApiModelProperty(required = true)
    private Supplier supplier;

    @NonNull
    @ApiModelProperty(required = true, example = "Test description")
    private String description;
}
