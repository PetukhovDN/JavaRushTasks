package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String[] stringArray = new String[10];
        int[] intArray = new int[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = reader.readLine();
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = stringArray[i].length();
            System.out.println(intArray[i]);
        }
    }
}
