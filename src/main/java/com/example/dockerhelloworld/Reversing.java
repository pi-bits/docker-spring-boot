package com.example.dockerhelloworld;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reversing {

    public static final String BLANK_SPACE = " ";

    public String reverse(char[] get_a_car) {
        String[] split = String.valueOf(get_a_car).split(BLANK_SPACE);
       return Arrays.stream(split).map(x -> reverseWord(x)).collect(Collectors.joining(" "));

    }

    private String reverseWord(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }
}
