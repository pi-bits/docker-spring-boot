package com.example.dockerhelloworld;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldReturnOnePointEach() throws Exception {
        int[]  A ={5,6,7};
        int[]  B = {3,6,10};
        int[] expectedResult = {1,1};

        int[] actualResult = Solution.solve(A, B);
        assertThat(actualResult, is(expectedResult));
    }
}