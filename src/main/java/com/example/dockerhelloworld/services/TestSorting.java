package com.example.dockerhelloworld.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestSorting {

    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();
        listDevs.sort((o1, o2) -> o1.getAge() - o2.getAge());
        listDevs.forEach((developer) -> System.out.println(developer.getAge()));

        listDevs.stream().filter(d -> d.getAge() > 30).forEach((d) -> System.out.println(d.getAge()));

        Arrays.stream(new int[]{1, 2, 3})
                .map(x -> 2 * x + 1)
                .average()
                .ifPresent(System.out::println);

        Stream.of("s1", "s2", "s3")
                .map(s -> s.substring((1)))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        Supplier<Stream<String>> streamSupplier = () -> Stream.of("s1", "s2", "s3")
                .map(s -> s.substring((1)));

        streamSupplier.get().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
        streamSupplier.get().sorted(((o1, o2) -> o1.compareTo(o2))).forEach(System.out::println);
        Transformer transformer = new Transformer();

        Developer developer = getDeveloperObjectFromJson((content, valueType) -> transformer.convertToObject(content, valueType));
        System.out.println(developer.getAge() + " _ " + developer.getName() + " _ " + developer.getSalary());
    }



    private static Developer getDeveloperObjectFromJson(BiFunction<String, Class, Object> transformer) {
        final String jsonInput = "{\"name\":\"Prashant\" , \"salary\":1200 , \"age\": 12}";
        return (Developer) transformer.apply(jsonInput, Developer.class);
    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }

}



