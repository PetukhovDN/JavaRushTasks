package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader1.readLine()));
        while (reader2.ready()){
            System.out.println(new StringBuilder(reader2.readLine()).reverse().toString());
        }
        reader1.close();
        reader2.close();
    }
}
