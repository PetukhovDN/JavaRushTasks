package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a > 0) {
            if (b > 0 && c > 0)
                System.out.println(3);
            else if (b > 0 || c > 0) System.out.println(2);
            else System.out.println(1);
        } else if (a <= 0) {
            if (b > 0 && c > 0) System.out.println(2);
            else if (b > 0 || c > 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
