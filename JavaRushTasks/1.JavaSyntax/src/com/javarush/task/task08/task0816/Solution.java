package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
        map.put("Грачев", dateFormat.parse("JUNE 7 2019"));
        map.put("Бергамотов", dateFormat.parse("JANUARY 29 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            if (value.getMonth() > 4 && value.getMonth() < 8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
    }
}
