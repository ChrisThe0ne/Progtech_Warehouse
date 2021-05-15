package com.example.warehouse.service;

import com.example.warehouse.controller.dto.*;
import com.example.warehouse.dao.*;
import com.example.warehouse.dao.entity.*;
import lombok.*;
import org.springframework.stereotype.Service;

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
    public List<Product> getAllProducts() {
        return productRepository.findAll().stream().map(Product::toProductRequest).collect(Collectors.toList());
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return productRepository.getAllByNameContaining(name).stream().map(Product::toProductRequest).collect(Collectors.toList());
    }

    @Override
    public List<ProductRecordRequest> getProductsByCategory(String category) {
        return null;
    }
    @Override
    public void delete(Integer productId) {
        Product temp = productRepository.getProductById(productId);
        productRepository.delete(temp);
    }

}
