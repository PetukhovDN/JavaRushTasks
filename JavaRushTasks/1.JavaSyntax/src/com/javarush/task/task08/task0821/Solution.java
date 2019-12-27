package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Денис");
        map.put("Иванов", "Максим");
        map.put("Ветров", "Иван");
        map.put("Лосев", "Олег");
        map.put("Григорьев", "Вова");
        map.put("Петров", "Денис");
        map.put("Левин", "Адексей");
        map.put("Иванов", "Дмитрий");
        map.put("Бокарев", "Иван");
        map.put("Петров", "Денис");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
