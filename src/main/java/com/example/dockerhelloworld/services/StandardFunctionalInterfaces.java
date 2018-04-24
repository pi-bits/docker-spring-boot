package com.example.dockerhelloworld.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaces {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Prashant", "Naik", 34),
                new Person("Radhika", "Naik", 30),
                new Person("Soham", "Naik", 2),
                new Person("Money", "Chintamani", 5)
        );

        //Step 1 : Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create method that prints all the names in the list
        performConditionally(people, p -> true, p -> System.out.println(p));

        //Step 3:Create a method that prints all people that have last name beginning with C
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getLastName()));


    }

    private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        for (Person person : people) {
            if (condition.test(person)) {
                consumer.accept(person);
            }
        }
    }


}
