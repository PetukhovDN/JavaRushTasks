package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float t = Float.parseFloat(reader.readLine());
        if (t % 5 >= 0 && t % 5 < 3)
            System.out.println("зеленый");
        else if (t % 5 >= 3 && t % 5 < 4)
            System.out.println("желтый");
        else if (t % 5 >= 4 && t % 5 < 5)
            System.out.printf("красный");//напишите тут ваш код
    }
}