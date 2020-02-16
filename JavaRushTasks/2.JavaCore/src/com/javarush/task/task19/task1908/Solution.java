package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2));
        StringBuilder builder = new StringBuilder();
        char[] buffer = new char[2048];
        while (bufferedReader.ready()) {
            int countData = bufferedReader.read(buffer);
            builder.append(buffer, 0, countData);
        }
        bufferedReader.close();
        String[] result = builder.toString().split(" ");
        for (String s : result) {
            try {
                bufferedWriter.write(Integer.parseInt(s) + " ");
            } catch (NumberFormatException e) {
            }
        }
        bufferedWriter.close();
    }
}
