package com.example.demo.config;

import com.example.demo.mapper.SimpleOrderMapper;
import com.example.demo.mapper.SimpleOrderMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public SimpleOrderMapper simpleOrderMapper() {
        return new SimpleOrderMapperImpl();
    }
}
