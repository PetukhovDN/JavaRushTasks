package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else map.put(data, 1);
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() < min) min = (int) entry.getValue();
        }

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(min)) System.out.print(entry.getKey() + " ");
        }
        reader.close();
        fileInputStream.close();
    }
}

