package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();

        List<String> list = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new FileReader(filename1));
        while (reader1.ready()) {
            list.add(reader1.readLine());
        }
        reader1.close();

        List<Long> list2 = new ArrayList<>();
        for (String s : list) {
            for (String split : s.split(" ")) {
                double a = Double.parseDouble(split);
                list2.add(Math.round(a));
            }
        }

        FileWriter writer = new FileWriter(filename2);
        for (Long l : list2) {
            writer.write(l + " ");
        }
        writer.close();

//        String[] s1 = Files.lines(Paths.get(reader.readLine()), StandardCharsets.UTF_8).collect(Collectors.joining()).split(" ");
//        for (String s2 : s1) {
//            try {
//                fileOutputStream.write(String.valueOf(Math.round(Integer.parseInt(s2))).getBytes());
//            } catch (NumberFormatException e) {
//                fileOutputStream.write(String.valueOf((int) Math.round(Double.parseDouble(s2))).getBytes());
//            } finally {
//                fileOutputStream.write(' ');
//            }
//        }
    }
}
