package com.example.dockerhelloworld.challenge3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        return Math.abs(diagonalOneSum(a) - diagonalTwoSum(a));

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    private static int diagonalOneSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j <= i; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    private static int diagonalTwoSum(int[][] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            int columnIndex = (input.length - 1) -i;
            for (int j =columnIndex; j<=columnIndex; j++) {
                sum += input[i][j];
            }
        }
        return sum;
    }
}

