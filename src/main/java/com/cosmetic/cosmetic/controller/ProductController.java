package com.cosmetic.cosmetic.controller;


import com.cosmetic.cosmetic.dto.ProductsDTO;
import com.cosmetic.cosmetic.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

@RequestMapping("/all")
    public Iterable<ProductsDTO> findAllProducts() {
        return productService.findAllProducts();
    }

    @RequestMapping("/{id}")
    public ProductsDTO findById(Long id) {
        return productService.findById(id);
    }
}
