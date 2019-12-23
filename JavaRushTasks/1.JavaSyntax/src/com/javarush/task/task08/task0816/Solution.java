package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Шварцнеггер", dateFormat.parse("JUNE 6 2002"));
        map.put("Филипс", dateFormat.parse("MAY 12 2015"));
        map.put("Джобс", dateFormat.parse("AUGUST 1 2012"));
        map.put("Гейтс", dateFormat.parse("APRIL 23 2017"));
        map.put("Марков", dateFormat.parse("JUNE 1 2012"));
        map.put("Васильев", dateFormat.parse("MAY 15 2001"));
        map.put("Лондонов", dateFormat.parse("SEPTEMBER 24 2012"));
        map.put("Грачев", dateFormat.parse("JULE 7 2019"));
        map.put("Бергамотов", dateFormat.parse("JANUARY 29 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            Date value = pair.getValue();
            String key = pair.getKey();
            if (value.getMonth() > 5 && value.getMonth() < 9) {
                map.remove(key);
            }
        }

    }

    public static void main(String[] args) throws ParseException {

    }
}
