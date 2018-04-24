package com.example.dockerhelloworld.services;

import java.util.function.BiConsumer;

public class ExceptionhandlingJava8 {
    public static void main(String[] args) {
        int[] someNumber = {1, 2, 3, 4};
        int key = 0;
        process(someNumber, key, (v, k) -> System.out.println(v / k));
    }

    private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumber) {
            biConsumer.accept(i, key);
        }

    }
}
