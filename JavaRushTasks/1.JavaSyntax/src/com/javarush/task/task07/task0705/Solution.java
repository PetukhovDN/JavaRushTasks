package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    //public static int dlina = 20;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }
        int[] intMinArray1 = new int[10];
        int[] intMinArray2 = new int[10];
        for (int i = 0; i < intArray.length / 2; i++) {
            intMinArray1[i] = intArray[i];
            intMinArray2[i] = intArray[i + 10];
            System.out.println(intMinArray2[i]);
        }

    }
}
