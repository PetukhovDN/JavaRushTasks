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
                else if (s.contains(".")) print(Double.parseDouble(s));
                else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) print(Integer.parseInt(s));
                else if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128) print(Short.parseShort(s));
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
