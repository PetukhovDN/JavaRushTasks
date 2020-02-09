package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int max = 0;
        FileInputStream fileInputStream = new FileInputStream(s);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (data >= max) {
                max = data;
            }
        }
        reader.close();
        fileInputStream.close();
        System.out.println(max);
    }
}
