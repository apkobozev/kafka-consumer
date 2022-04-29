package com.example.demo.service;

import com.example.demo.dto.OrderDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class MsgConsumer {

    private static final String orderTopic = "${topic.name}";
    private final FoodOrderService foodOrderService;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = orderTopic)
    public void consumeMessage(String msg) throws JsonProcessingException {
        log.info("Message consumed: " + msg);
        OrderDto dto = objectMapper.readValue(msg, OrderDto.class);
        foodOrderService.persistOrder(dto);
    }

}
