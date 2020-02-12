package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(s.substring(0, s.lastIndexOf(".part")), true));
        Set<String> set = new TreeSet<>();
        while (!s.equals("end")) {
            set.add(s);
            s = reader.readLine();
        }
        reader.close();

        for (String str : set) {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(str));
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                bufferedOutputStream.write(data);
            }
            inputStream.close();
        }
        bufferedOutputStream.close();
    }
}
