package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            map.merge(data, 1, Integer::sum);
        }
        inputStream.close();
        map.forEach((k, v) -> System.out.println((char) k.intValue() + " " + v));
    }
}
