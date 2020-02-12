package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                List<String> list = new LinkedList<>();
                String line;
                while ((line = fileReader.readLine()) != null) {
                    int i1 = Integer.parseInt(line.substring(0, 8).trim());
                    if (i1 == Integer.parseInt(args[1])) {
                        if ("-u".equals(args[0])) {
                            list.add(String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
                        } else {
                            list.add(line);
                        }
                    }
                }
                if (args[0].equals("-d")) {
                    Iterator<String> iter = list.iterator();
                    while (iter.hasNext()) {
                        String str = iter.next();
                        if (str.startsWith(args[1])) {
                            iter.remove();
                        }
                        break;
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
    }
}
