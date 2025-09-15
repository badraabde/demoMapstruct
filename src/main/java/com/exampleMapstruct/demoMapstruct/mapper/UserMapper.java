package com.exampleMapstruct.demoMapstruct.mapper;

import com.exampleMapstruct.demoMapstruct.dto.UserDTO;
import com.exampleMapstruct.demoMapstruct.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);
}
