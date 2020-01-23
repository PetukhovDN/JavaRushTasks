package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.5, "qwer");
        labels.put(3.5, "ert");
        labels.put(4.5, "tryu");
        labels.put(5.5, "uio");
        labels.put(6.5, "sdfs");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
