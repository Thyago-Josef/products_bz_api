package com.cosmetic.cosmetic.controller;


import com.cosmetic.cosmetic.dto.ProductsDTO;
import com.cosmetic.cosmetic.model.Products;
import com.cosmetic.cosmetic.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/barcode/{barcode}")
    public ProductsDTO findByBarcode(String barcode) {
        return productService.findByBarcode(barcode);
    }

    @PostMapping("/create")
    public ResponseEntity<ProductsDTO>  createProduct(@RequestBody ProductsDTO productDTO) {
        ProductsDTO  dto = productService.createProduct(productDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDTO);
    }
}
