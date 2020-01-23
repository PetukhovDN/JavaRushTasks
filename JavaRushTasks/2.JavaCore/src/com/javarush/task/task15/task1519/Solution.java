package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напиште тут ваш код
        String s = null;
        while (true)
            try {
                s = reader.readLine();
                if (s.equals("exit")) break;
                double d = Double.parseDouble(s);
                if (d % 1 > 0) print(d);
                else if (d <= 0 || d >= 128) print((int) d);
                else if (d > 0 && d < 128) print((short) d);
            } catch (NumberFormatException e) {
                print(s);
            }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
