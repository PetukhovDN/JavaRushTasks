package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

import static java.lang.Thread.interrupted;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.stop = false;
    }

    public static class TestThread implements Runnable {
        public static boolean stop = true;
        public void run() {
            while (stop) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
