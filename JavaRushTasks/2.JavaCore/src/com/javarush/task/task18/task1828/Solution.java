package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        if (args[0].equals("-u")) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String fileName = reader.readLine();
                try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                    List<String> list = new ArrayList<>();
                    String line;
                    while ((line = fileReader.readLine()) != null) {
                        if (line.startsWith(args[1])) {
                            list.add(String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
                        } else {
                            list.add(line);
                        }
                    }
                    try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
                        for (String s : list) {
                            fileOutputStream.write((String.format("%s%n", s)).getBytes());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (args[0].equals("-d")) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String fileName = reader.readLine();
                try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                    List<String> list = new ArrayList<>();
                    String line;
                    while ((line = fileReader.readLine()) != null) {
                        list.add(line);
                    }
                    list.removeIf(str -> str.startsWith(args[1]));
                    try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
                        for (String s : list) {
                            fileOutputStream.write((String.format("%s%n", s)).getBytes());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}