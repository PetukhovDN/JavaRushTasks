package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        while (bufferedReader.ready()) {
            String[] strings = bufferedReader.readLine().split(" ");
            if (map.containsKey(strings[0])) {
                map.put(strings[0], map.get(strings[0]) + Double.parseDouble(strings[1]));
            } else {
                map.put(strings[0], Double.parseDouble(strings[1]));
            }
        }
        bufferedReader.close();
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
