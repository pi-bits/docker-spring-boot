package com.example.dockerhelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Component
public class RegexValidator {

    public boolean isValid(Predicate<String> condition,String accountNumber) {
        return condition.test(accountNumber);
    }
}
