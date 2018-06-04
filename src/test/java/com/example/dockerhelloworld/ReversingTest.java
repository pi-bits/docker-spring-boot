package com.example.dockerhelloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversingTest {

    public static final String EXPECTED_REVERSED_STRING = "teg a rac";
    public static final String ACTUAL_REVERSED_STRING = "get a car";

    @Test
    public void reverseASentence() throws Exception {
        Reversing reversing = new Reversing();
        assertEquals(EXPECTED_REVERSED_STRING,reversing.reverse(ACTUAL_REVERSED_STRING.toCharArray()));
    }
}