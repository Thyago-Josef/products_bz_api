package com.cosmetic.cosmetic.mappers;

import com.cosmetic.cosmetic.dto.ProductsDTO;
import com.cosmetic.cosmetic.model.Products;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProductMapper {

     ProductsDTO toDTO(Products product) ;

    Products toEntity(ProductsDTO productDTO);


}
