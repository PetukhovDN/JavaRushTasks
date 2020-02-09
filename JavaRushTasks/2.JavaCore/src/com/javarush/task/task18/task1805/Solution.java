package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        List<Integer> list = new ArrayList<>(fileInputStream.available() + 1);
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();
        list.stream().distinct().sorted().forEach(x -> System.out.print(x + " "));
    }
}
