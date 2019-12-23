package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Петров", 250);
        map.put("Иванов", 700);
        map.put("Сидоров", 499);
        map.put("Михалков", 399);
        map.put("Сергеев", 2000);
        map.put("Масляков", 269);
        map.put("Рожков", 234234);
        map.put("Брандт", 999);
        map.put("Лось", 1000);
        map.put("Мухоморов", 1233);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) map.remove(pair.getKey(), pair.getValue());
        }
    }

    public static void main(String[] args) {
    }
}