package com.cosmetic.cosmetic.service;

import com.cosmetic.cosmetic.dto.ProductsDTO;
import com.cosmetic.cosmetic.mappers.ProductMapper;
import com.cosmetic.cosmetic.model.Products;
import com.cosmetic.cosmetic.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService {


    private final ProductRepository productRepository;

    private final ProductMapper productMapper;


    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public Iterable<ProductsDTO> findAllProducts() {
        return Collections.singleton(productMapper.toDTO((Products)productRepository.findAll()));
    }

    public ProductsDTO findById(Long id) {
        return productMapper.toDTO(productRepository.findById(id).get());
    }

}
