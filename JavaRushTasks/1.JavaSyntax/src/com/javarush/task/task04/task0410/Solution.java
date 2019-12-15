package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        int n = a;
        if ((n <= 100) && (n >= 50)) {
            System.out.println("Число " + n + " содержится в интервале.");
        } else System.out.println("Число " + n + " не содержится в интервале.");//напишите тут ваш код

    }
}