package com.example.dockerhelloworld.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.function.BiFunction;

public class Transformer {

    public Object convertToObject(String x, Class<?> y) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
           return objectMapper.readValue(x, y);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
