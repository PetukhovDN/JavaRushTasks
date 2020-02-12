package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args[0]));
        int count = 0;
        String s1 = "qwertyuiopasdfghjklzxcvbnm";
        String s2 = Files.lines(Paths.get(args[0]), StandardCharsets.UTF_8).map(String::toLowerCase).collect(Collectors.joining());
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.toLowerCase().charAt(i)) {
                    count++;
                }
            }
        }
        bufferedInputStream.close();
        System.out.println(count);
    }
}
