package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = reader.readLine();
            try {
                FileInputStream fileInputStream = new FileInputStream(s);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(s);
                reader.close();
                break;
            }
        }
    }
}

