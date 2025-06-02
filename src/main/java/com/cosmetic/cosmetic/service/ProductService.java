package com.cosmetic.cosmetic.service;

import com.cosmetic.cosmetic.dto.ProductsDTO;
import com.cosmetic.cosmetic.mappers.ProductMapper;
import com.cosmetic.cosmetic.model.Products;
import com.cosmetic.cosmetic.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {


    private final ProductRepository productRepository;

    private final ProductMapper productMapper;


    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public List<ProductsDTO> findAllProducts() { // Change return type to List<ProductsDTO>
        // 1. Get all entities from the repository
        List<Products> products = productRepository.findAll(); // findAll() returns a List<Products>

        // 2. Use the mapper to convert each entity in the list to a DTO
        //    and collect them into a new List of ProductsDTO
        return products.stream()
                .map(productMapper::toDTO) // Map each 'Products' entity to a 'ProductsDTO'
                .collect(Collectors.toList()); // Collect the results into a List
    }

    public ProductsDTO findById(Long id) {
        return productMapper.toDTO(productRepository.findById(id).get());
    }


    public ProductsDTO createProduct(ProductsDTO productDTO) {
        Products product = productMapper.toEntity(productDTO);
        product = productRepository.save(product);
        return productMapper.toDTO(product);
    }

    public ProductsDTO findByBarcode(String barcode) {
        return productMapper.toDTO(productRepository.findByBarcode(barcode));
    }

}
