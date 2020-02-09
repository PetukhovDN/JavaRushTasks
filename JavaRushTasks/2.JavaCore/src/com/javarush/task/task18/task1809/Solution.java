package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        FileInputStream f1 = new FileInputStream(filename1);
        FileOutputStream f2 = new FileOutputStream(filename2);
        while (f1.available() > 0) {
            byte[] array = new byte[f1.available()];
            byte[] reversedArray = new byte[array.length];
            f1.read(array);
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            f2.write(reversedArray);
        }
        reader.close();
        f1.close();
        f2.close();
    }
}
