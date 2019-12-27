package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date2.setMonth(Calendar.JANUARY);
        date2.setDate(1);
        long a = (date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24) + 1;
        return !(a % 2 == 0);
    }
}
