package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())//напишите тут ваш код
        {
            String value = pair.getValue();
            if (value.equals(name))
                count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName))
                count++;
        }
        return count;


    }


    public static void main(String[] args) {

    }
}
