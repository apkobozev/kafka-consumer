package com.example.demo.service;

import com.example.demo.dto.OrderDto;
import com.example.demo.entity.OrderEntity;
import com.example.demo.mapper.SimpleOrderMapper;
import com.example.demo.repository.FoodOrderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class FoodOrderService {

    private final SimpleOrderMapper mapper;
    private final FoodOrderRepository foodOrderRepository;

    public void persistOrder(OrderDto dto) {
        OrderEntity entity = mapper.mapOrderDtoToOrderEntity(dto);
        foodOrderRepository.save(entity);
        log.info("Order: " + dto + " saved.");
    }
}
