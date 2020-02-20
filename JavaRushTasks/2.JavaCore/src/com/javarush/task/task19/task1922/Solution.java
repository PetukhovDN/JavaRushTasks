package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        while (reader1.ready()) {
            String s1 = reader1.readLine();
            long s2 = Stream.of(s1.split(" "))
                    .filter(s -> words.contains(s))
                    .count();
            if (s2 == 2) {
                System.out.println(s1);
            }
        }
        reader1.close();
    }
}
