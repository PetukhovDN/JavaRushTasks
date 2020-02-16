package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
        while (bufferedReader.ready()) {
            String s = bufferedReader.readLine();
            bufferedWriter.write(s.replaceAll("\\.", "!"));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
