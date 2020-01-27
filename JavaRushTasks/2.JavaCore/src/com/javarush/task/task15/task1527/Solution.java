package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String params = s.substring(s.indexOf('?') + 1);
        String[] splitParams = params.split("&");
        Map<String, String> paramsMap = new HashMap<>();

        //not finished yet
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

        /*
        StringBuilder builder = new StringBuilder();
        Matcher m = Pattern.compile("[?&=].+?[&=]").matcher(s);
        while (m.find()) builder.append(s, m.start() + 1, m.end() - 1).append(" ");
        Matcher m2 = Pattern.compile("&.+?=").matcher(s);
        while (m2.find()) builder.append(s, m2.start() + 1, m2.end() - 1).append(" ");

        String str = s.substring(s.indexOf('?') + 1, s.indexOf('='));
        String str2 = s.substring(s.indexOf('=') + 1, s.indexOf('&'));
        while (str2.contains("&")) builder.append(s.substring(s.indexOf('&') + 1, s.indexOf('&')));
        System.out.println(str);
        System.out.println(builder);
        Matcher m3 = Pattern.compile("=.+?&").matcher(s);
        while (m3.find()) {
            if (s.contains("obj")) {
                String s3 = s.substring(m3.start() + 1, m3.end() - 1);
                try {
                    alert(Double.parseDouble(s3));
                } catch (NumberFormatException e) {
                    alert(s3);
                }
            }
        }
        */