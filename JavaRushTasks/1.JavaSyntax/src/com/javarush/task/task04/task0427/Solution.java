package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());//напишите тут ваш код
        if (a > 0 && a < 10) {
            if (a % 2 == 0) System.out.println("четное однозначное число");
            else System.out.println("нечетное однозначное число");
        } else if (a >= 10 && a < 100) {
            if (a % 2 == 0) System.out.println("четное двузначное число");
            else System.out.println("нечетное двузначное число");
        } else if (a >= 100 && a < 1000) {
            if (a % 2 == 0) System.out.println("четное трехзначное число");
            else System.out.println("нечетное трехзначное число");
        }
    }
}
