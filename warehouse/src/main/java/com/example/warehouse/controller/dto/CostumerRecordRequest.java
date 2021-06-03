package com.example.warehouse.controller.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
public class CostumerRecordRequest {

    @NonNull
    @ApiModelProperty(required = true, example = "Test Name")
    private String name;

    @NonNull
    @ApiModelProperty(required = true, example = "Test phone")
    private String phone;

    @NonNull
    @ApiModelProperty(required = true, example = "9999")
    private String email;
}
