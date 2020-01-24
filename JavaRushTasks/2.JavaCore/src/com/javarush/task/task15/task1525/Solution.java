package com.javarush.task.task15.task1525;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        try {
            lines = Files.readAllLines(Paths.get(Statics.FILE_NAME));
            /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            String s;
            while ((s = reader.readLine()) != null) {
                lines.add(s);
            }

             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
