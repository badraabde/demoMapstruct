package com.exampleMapstruct.demoMapstruct.mapper;

import com.exampleMapstruct.demoMapstruct.dto.OrderDTO;
import com.exampleMapstruct.demoMapstruct.model.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

   OrderDTO toDTO(Order order);

    Order toEntity(OrderDTO orderDTO);
}
