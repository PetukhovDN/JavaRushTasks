package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int[] intArray = new int[15];
        int countChet = 0;
        int countNechet = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
            if ((i % 2) == 0)
                countChet += intArray[i];
            else
                countNechet += intArray[i];
        }
        if (countChet > countNechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
