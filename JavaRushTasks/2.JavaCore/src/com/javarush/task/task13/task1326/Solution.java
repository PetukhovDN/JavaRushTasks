package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        String str;
        List<Integer> list = new LinkedList<>();
        while ((str = fileReader.readLine()) != null) {
            list.add(Integer.valueOf(str));
        }

        list.stream().filter(v -> v % 2 == 0).sorted().forEach(System.out::println);

        reader.close();
        fileReader.close();

        /* Работает вроде верно, валидатор не проходит)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Files.lines(Paths.get(reader.readLine()))
                .sorted()
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        */
    }
}
