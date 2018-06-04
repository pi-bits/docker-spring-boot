package com.example.dockerhelloworld.challenge3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    int[][] input;

    @Before
    public void setUp() throws Exception {
        input = new int[3][3];
        int[] row1 = {11, 2, 4};
        int[] row2 = {4, 5, 6};
        int[] row3 = {10, 8, -12};


        populateRow(row1, 0);
        populateRow(row2, 1);
        populateRow(row3, 2);


    }


    @Test
    public void diagonalDifference() throws Exception {

        assertThat(15,is(Solution.diagonalDifference(input)));
    }



    private void populateRow(int[] row1, int rowNumber) {
        for (int j = 0; j < 3; j++) {
            input[rowNumber][j] = row1[j];
        }
    }

}