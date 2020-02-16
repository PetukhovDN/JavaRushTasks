package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName);
        StringBuilder builder = new StringBuilder();
        char[] buffer = new char[2048];
        while (fileReader.ready()) {
            int countData = fileReader.read(buffer);
            builder.append(buffer, 0, countData );
        }
        fileReader.close();
        int count = 0;
        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(builder.toString());
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);

    }
}
