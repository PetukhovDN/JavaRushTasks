package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stop = false;
        int x = 0;
        while (!stop){
            String s = reader.readLine();
            int y = Integer.parseInt(s);
            x+=y;
            stop = s.equals("-1");//напишите тут ваш код
        }
        System.out.println(x);

    }
}
