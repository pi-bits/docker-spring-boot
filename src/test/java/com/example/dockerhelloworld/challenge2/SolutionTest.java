package com.example.dockerhelloworld.challenge2;

import org.assertj.core.api.Assertions;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void shouldSolve() throws Exception {
        int[] ar =  {1 ,2 ,3, 4 ,10 ,11};
        int actualResult = Solution.simpleArraySum(ar);
        Assert.assertEquals(31,actualResult);
    }

}