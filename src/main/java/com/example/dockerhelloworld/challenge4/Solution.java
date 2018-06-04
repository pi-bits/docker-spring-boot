package com.example.dockerhelloworld.challenge4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        System.out.println(calculateFractions(arr));

    }

    static String calculateFractions(int[] arr) {

        StringBuilder stringBuilder = new StringBuilder();
        Double length = Double.valueOf(arr.length);
        stringBuilder.append(BigDecimal.valueOf(getCount(arr, (x) -> x > 0)/ length).setScale(6, RoundingMode.HALF_UP));
        stringBuilder.append("\n");
        stringBuilder.append(BigDecimal.valueOf(getCount(arr, (x) -> x < 0)/ length).setScale(6, RoundingMode.HALF_UP));
        stringBuilder.append("\n");
        stringBuilder.append(BigDecimal.valueOf(getCount(arr, (x) -> x == 0)/ length).setScale(6, RoundingMode.HALF_UP));
        return stringBuilder.toString();
    }

    private static long getCount(int[] arr, IntPredicate condition) {
        return Arrays.stream(arr).filter(condition).count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

