package com.margaritasosnovskaya.MyLocation.mappers;

import com.margaritasosnovskaya.MyLocation.dto.UserDTO;
import com.margaritasosnovskaya.MyLocation.models.User;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
