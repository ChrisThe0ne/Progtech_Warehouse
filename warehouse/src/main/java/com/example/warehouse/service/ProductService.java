package com.example.warehouse.service;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.*;
import com.example.warehouse.dao.entity.*;
import lombok.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductServiceInterface{

    private final ProductRepository productRepository;

    @Override
    public void addProduct(ProductRecordRequest request) {
        /*
        Optional.ofNullable(productRepository.getByName(request.getName())).ifPresent(product ->
                {throw new RuntimeException(String.format("%s termék név már foglalt ", product.getName()));}
        );
        */

        Product product = Product.addProduct(request);
        productRepository.save(product);
    }

    @Override
    public List<ProductRecordRequest> getAllProducts() {
        return productRepository.findAll().stream().map(Product::toProductRequest).collect(Collectors.toList());
    }


    @Override
    public List<ProductRecordRequest> getProductsByName(String name) {
        return productRepository.getAllByNameContaining(name).stream().map(Product::toProductRequest).collect(Collectors.toList());
    }

    @Override
    public List<ProductRecordRequest> getProductsByCategory(String category) {
        return null;
    }

}
