package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Иван");
        map.put("Иванов", "Петр");
        map.put("Сидоров", "Марк");
        map.put("Михалков", "Олег");
        map.put("Сергеев", "Вазген");
        map.put("Масляков", "Роман");
        map.put("Рожков", "Петр");
        map.put("Брандт", "Марк");
        map.put("Лось", "Иван");
        map.put("Мухоморов", "Сергей");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> list = new ArrayList<String>(map.values());

        int count;
        for (String s1 : list) {
            count = 0;
            for (String s2 : list) {
                if (s1.equals(s2))
                    count++;
                if (count == 2) removeItemFromMapByValue(map, s1);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
