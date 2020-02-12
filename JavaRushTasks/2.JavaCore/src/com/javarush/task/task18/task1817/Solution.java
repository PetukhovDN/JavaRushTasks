package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        double count1 = 0;
        double count2 = 0;
        while (fileReader.ready()) {
            char s = (char) fileReader.read();
            count1++;
            if (s == ' ') {
                count2++;
            }
        }
        fileReader.close();
        double d = count2 / count1 * 100;
        System.out.printf(Locale.ENGLISH, "%.2f", d);
    }
}
