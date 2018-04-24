package com.example.dockerhelloworld.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcersiceSolutionJava8 {
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
        printConditionally(people, p -> true);

        //Step 3:Create a method that prints all people that have last name beginning with C
        printConditionally(people,  p -> p.getLastName().startsWith("C"));


    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }



}

