package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(s1));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(s2));
        FileOutputStream fileOutputStream = new FileOutputStream(s1,true);
        int i;
        List<Character> list = new ArrayList<>();
        while ((i = bufferedInputStream1.read()) != -1) {
            list.add((char) i);
        }
        int k;
        while ((k = bufferedInputStream2.read()) != -1) {
            fileOutputStream.write((char) k);
        }
        for (Character character : list) {
            fileOutputStream.write(character);
        }
        bufferedInputStream1.close();
        bufferedInputStream2.close();
        fileOutputStream.close();
    }
}
