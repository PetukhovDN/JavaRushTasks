package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b =  0;
        for (int i = 0; i <3 ; i++) {
            int x = Integer.parseInt(reader.readLine());
            if (x > 0) a++;
            else if (x < 0) b++;
        }
        System.out.println("количество отрицательных чисел: " + b);
        System.out.println("количество положительных чисел: " + a);
    }
}
