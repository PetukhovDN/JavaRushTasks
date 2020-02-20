package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        while (reader1.ready()) {
            list1.add(reader1.readLine());
        }
        reader1.close();
        while (reader2.ready()) {
            list2.add(reader2.readLine());
        }
        reader2.close();
        for (int i = 0; i < Math.min(list1.size(), list2.size()); ) {
            if (list1.get(i).equals(list2.get(i))) {
                lines.add(new LineItem(Type.SAME, list1.get(i)));
                list1.remove(i);
                list2.remove(i);
            } else if (!list1.get(i).equals(list2.get(i + 1))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                list1.remove(i);
            } else {
                lines.add((new LineItem(Type.ADDED, list2.get(i))));
                list2.remove(i);
            }
        }
        if (list1.size() != 0) {
            lines.add(new LineItem(Type.REMOVED, list1.get(0)));
        } else if (list2.size() != 0) {
            lines.add(new LineItem(Type.ADDED, list2.get(0)));
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
