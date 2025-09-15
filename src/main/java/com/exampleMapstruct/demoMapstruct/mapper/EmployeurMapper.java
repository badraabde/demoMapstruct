package com.exampleMapstruct.demoMapstruct.mapper;

import com.exampleMapstruct.demoMapstruct.dto.EmployeurDTO;
import com.exampleMapstruct.demoMapstruct.dto.OrderDTO;
import com.exampleMapstruct.demoMapstruct.model.Employeur;
import com.exampleMapstruct.demoMapstruct.model.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeurMapper {

    EmployeurDTO toDTO(Employeur employeur);

    Employeur toEntity(EmployeurDTO employeurDTO);
}

