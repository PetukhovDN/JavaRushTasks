package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(s2));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(s3));
        FileOutputStream fileOutputStream = new FileOutputStream(s1, true);
        while (bufferedInputStream1.available() > 0) {
            int chars1 = bufferedInputStream1.read();
            fileOutputStream.write(chars1);
        }
        while (bufferedInputStream2.available() > 0) {
            int chars2 = bufferedInputStream2.read();
            fileOutputStream.write(chars2);
        }
        reader.close();
        bufferedInputStream1.close();
        bufferedInputStream2.close();
        fileOutputStream.close();
    }
}
