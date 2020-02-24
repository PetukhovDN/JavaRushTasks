package com.javarush.task.task19.task1918;

/*
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * На потом (изучить jsoup, решить с его помощью)
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().endsWith(".html")) {
            StringBuilder builder = new StringBuilder();
            try (BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()))) {
                while (reader1.ready()) {
                    builder.append(reader1.readLine());
                }
            }
            List<String> list = new ArrayList<>();
            for (int i = 0; i < builder.length(); i++) {
                StringBuilder builder1 = new StringBuilder(builder.substring(builder.indexOf("<" + args[0]), builder.indexOf("</" + args[0])));
                System.out.println(builder1);
            }
        }
    }
}
