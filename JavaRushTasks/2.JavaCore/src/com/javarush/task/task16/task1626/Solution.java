package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexDown = 1;

        public void run() {
            try {
                while (countIndexDown <= number) {
                    System.out.println(toString());
                    countIndexDown += 1;
                    //if ( == number + 1) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }

        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (countIndexDown > 0) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    //if () return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
