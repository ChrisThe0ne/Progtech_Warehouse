package com.example.warehouse.controller.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
public class SupplierRecordRequest {

    @NonNull
    @ApiModelProperty(required = true, example = "Test supplier")
    private String name;

    @NonNull
    @ApiModelProperty(required = true, example = "Test address")
    private String address;

    @NonNull
    @ApiModelProperty(required = true, example = "Test description supplier")
    private String description;
}
