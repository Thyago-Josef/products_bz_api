package com.cosmetic.cosmetic.repository;


import com.cosmetic.cosmetic.dto.ProductsDTO;
import com.cosmetic.cosmetic.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {


    Products findByBarcode(String barcode);

    Iterable<ProductsDTO> findAllProductsByUser(String email);
}
