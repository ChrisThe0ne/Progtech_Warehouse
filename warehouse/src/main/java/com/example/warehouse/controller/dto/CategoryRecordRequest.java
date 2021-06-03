package com.example.warehouse.controller.dto;

import com.example.warehouse.dao.entity.Category;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
public class CategoryRecordRequest {

    @NonNull
    @ApiModelProperty(required = true, example = "Test category")
    private String name;
}
