package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = ints[0];
        int minimum = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > maximum) maximum = ints[i];
            if (ints[i] < minimum) minimum = ints[i];
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
