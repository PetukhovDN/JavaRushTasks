package com.javarush.task.task13.task1308;

/* 
Эй, ты там живой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Person {
        static boolean isAlive() {
            return true;
        }

    }

    public interface Presentable extends Person {

    }
}