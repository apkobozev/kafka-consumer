package com.example.demo.mapper;

import com.example.demo.dto.OrderDto;
import com.example.demo.entity.OrderEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleOrderMapper {
    public OrderEntity mapOrderDtoToOrderEntity(OrderDto dto);
}
