package com.example.dockerhelloworld.services;

import java.io.Serializable;
import java.math.BigDecimal;

public class Developer implements Serializable{
    private  String name;
    private  BigDecimal salary;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    private  int age;

    public Developer() {
    }



    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


}
