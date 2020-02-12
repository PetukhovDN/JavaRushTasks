package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length < 4 || !args[0].equals("-c")) return;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int max = 0;
                List<String> list = new LinkedList<>();
                while ((line = fileReader.readLine()) != null) {
                    list.add(line);

                    int i = Integer.parseInt(line.substring(0, 8).trim());
                    if (max < i) {
                        max = i;
                    }
                }
                try (FileOutputStream fos = new FileOutputStream(fileName)) {
                    for (String s : list) {
                        fos.write((String.format("%s%n", s)).getBytes());
                    }

                    fos.write(String.format("%-8s%-30s%-8s%-4s%n", ++max, args[1], args[2], args[3]).getBytes());
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Код снизу работает верно но не пропускается.
 * А может и неверно работает - раз не пропускается.
 */
/*public class Solution {
    public static void main(String[] args) throws Exception {
        if (!args[0].equals("-c") || args.length < 4) return;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        reader.close();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        int i = 0;
        while (reader1.ready()) {
            String s = reader1.readLine();
            String s2 = s.substring(0, 8).trim();
            if (Integer.parseInt(s2) > i) {
                i = Integer.parseInt(s2);
            }
        }
        reader1.close();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
        StringBuilder builder = new StringBuilder();
            for (int j = 1; j < args.length - 2; j++) {
                builder.append(args[j]);
            }
        String s = String.format("%-8d%-30s%-8.2f%-4d%n", ++i, builder.toString(), Float.parseFloat(args[args.length - 2]), Integer.parseInt(args[args.length - 1]));
        bufferedOutputStream.write(s.getBytes());
        bufferedOutputStream.close();
    }
}*/

