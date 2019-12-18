package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int a = Integer.parseInt(reader.readLine());
        int x;
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    x = 366;
                } else x = 365;
            } else x = 366;
        } else x = 365;
        System.out.println("количество дней в году: " + x);
    }
}