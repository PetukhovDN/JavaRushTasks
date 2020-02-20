package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder builder = new StringBuilder();
        while (reader.ready()) {
            String[] strings = reader.readLine().split(" ");
            for (String s : strings) {
                if (s.length() > 6) {
                    builder.append(s).append(",");
                }
            }
        }
        writer.write(builder.deleteCharAt(builder.length() - 1).toString());
        reader.close();
        writer.close();
    }
}
