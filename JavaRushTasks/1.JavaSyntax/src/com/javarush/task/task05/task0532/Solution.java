package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            Arrays.sort(arr);
            int maximum = arr[arr.length-1];

            System.out.println(maximum);
        }
    }
}
