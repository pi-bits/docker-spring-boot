package com.example.dockerhelloworld;

import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class RegexValidator {

    public boolean isValid(Predicate<String> condition,String accountNumber) {
        return condition.test(accountNumber);
    }
}
