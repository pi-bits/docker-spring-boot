package com.example.dockerhelloworld.services;

import java.util.function.*;

public class FunctionalPackageExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (b, c) -> b / c;
        System.out.println(biFunction.apply(10, 5));

        addNumbersAndPrintResults(1, 2, (num1, num2) -> System.out.println(num1 + num2));

        BinaryOperator<Integer> adder = (num1 ,num2) -> num1+num2;
        System.out.println(adder.apply(2,5));

        BinaryOperator<Integer> divider = (num1 ,num2) -> num1/num2;
        System.out.println(divider.apply(10,5));

        BinaryOperator<Integer> substractor = (num1 ,num2) -> num1-num2;
        System.out.println(substractor.apply(10,5));

        System.out.println(operator( 1,2 ,(num1 ,num2) -> num1+num2));
        System.out.println(operator( 10,5 ,(num1 ,num2) -> num1/num2));
        System.out.println(operator( 2,2 ,(num1 ,num2) -> num1*num2));
        System.out.println(operator( 20,10 ,(num1 ,num2) -> num1%num2));
        System.out.println(operator( 10,5 ,(num1 ,num2) -> num1-num2));

        BiPredicate<Integer,Integer> biPredicate = (num1 , num2)-> num2>num1;
        System.out.println(biPredicate.test(10,11));

        Predicate<Integer> predicate =(num1)-> num1>20;
        System.out.println(predicate.or( (num2) -> num2>50));
    }
    private static Integer operator(Integer num1, Integer num2, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(num1, num2);
    }

    private static void addNumbersAndPrintResults(Integer num1, Integer num2, BiConsumer<Integer, Integer> biConsumer) {
        biConsumer.accept(num1, num2);
    }


}
