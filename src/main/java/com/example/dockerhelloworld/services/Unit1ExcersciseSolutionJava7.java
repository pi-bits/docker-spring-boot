package com.example.dockerhelloworld.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcersciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Prashant", "Naik", 34),
                new Person("Radhika", "Naik", 30),
                new Person("Soham", "Naik", 2),
                new Person("Money", "Chintamani", 5)
        );

        //Step 1 : Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //Step 2: Create method that prints all the names in the list
        printAll(people);

        //Step 3:Create a method that prints all people that have last name beginning with C
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C") ? true : false;
            }
        });

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    interface Condition {
        boolean test(Person person);
    }

}
