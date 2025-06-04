package com.cosmetic.cosmetic.mappers;

import com.cosmetic.cosmetic.dto.UsersDTO;
import com.cosmetic.cosmetic.model.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UsersDTO toDTO(Users user);

    Users toEntity(UsersDTO userDTO);

}
