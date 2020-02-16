package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String str = outputStream.toString();
        String[] strings = str.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        String result = "";
        switch (strings[1]) {
            case "+":
                result = a + " + " + b + " = " + (a + b);
                break;
            case "-":
                result = a + " - " + b + " = " + (a - b);
                break;
            case "*":
                result = a + " * " + b + " = " + (a * b);
                break;
        }
        System.setOut(consoleStream);
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

