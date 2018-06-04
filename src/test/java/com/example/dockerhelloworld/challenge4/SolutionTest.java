package com.example.dockerhelloworld.challenge4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void plusMinusTest() throws Exception {
        assertEquals("0.500000\n0.333333\n0.166667", Solution.calculateFractions(new int[]{-4, 3, -9, 0, 4, 1}));
    }
}