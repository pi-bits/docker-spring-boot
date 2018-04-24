package com.example.dockerhelloworld.services;

public class TypeInferenceExample {
    public static void main(String[] args) {
        printLambda(s -> s.length());
    }

    public static void printLambda(MyInterface myInterface){
        System.out.println(myInterface.getLength("Prashant"));
    }

    interface MyInterface{
        Integer getLength(String input);
    }
}

