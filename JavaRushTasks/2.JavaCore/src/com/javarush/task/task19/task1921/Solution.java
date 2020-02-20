package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        while (bufferedReader.ready()) {
            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            String[] s = bufferedReader.readLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                if (i < s.length - 3) {
                    builder1.append(s[i]).append(" ");
                } else {
                    builder2.append(s[i]).append(" ");
                }
            }
            PEOPLE.add(new Person(builder1.toString().trim(), new SimpleDateFormat("dd MM yyyy").parse(builder2.toString().trim())));
        }
        bufferedReader.close();
    }
}
