package com.example.dockerhelloworld.services;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Prashant", "Naik", 34),
                new Person("Radhika", "Naik", 30),
                new Person("Soham", "Naik", 2),
                new Person("Money", "Chintamani", 5)
        );

        people.stream()
                .filter(person -> person.getLastName().endsWith("Naik"))
                .forEach(System.out::println);

        int sum = IntStream
                .range(1, 5)
                .sum();
        System.out.println(sum);
        Stream.of("prashant","radhika","soham").sorted().findFirst().ifPresent(System.out::println);
        String[] names = {"Sarah","Sarika","shivika","Kushal","ankit","All","amanda","Hans","Brent"};

        Arrays.stream(names)
                .filter(x->StringUtils.startsWithIgnoreCase(x,"S"))
                .sorted()
                .forEach(System.out::println);

        int[] numbers = {2,4,6,8,10};
        //4 , 16, 36, 64,100 = 220/5 = 44

        Arrays.stream(numbers)
                .map(x->x*x)
                .average()
                .ifPresent(System.out::println);
Arrays.stream(names)
        .map(x->x.toLowerCase())
        .filter(x->x.startsWith("a"))
        .forEach(System.out::println);
        Arrays.stream(names).
                reduce((acc,name)-> acc + "\t" + name)
                .ifPresent(System.out::println);
    }


}
