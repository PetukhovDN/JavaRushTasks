package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String name = reader.readLine();
        for (int i = 0; i < 10 ; i++) {
            System.out.println(name + " любит меня.");
        }

    }
}
