package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new TestedThread1());
        threads.add(new TestedThread2());
        threads.add(new TestedThread3());
        threads.add(new TestedThread4());
        threads.add(new TestedThread5());
    }

    public static void main(String[] args) {
    }

    public static class TestedThread1 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (true) {
                i++;
            }
        }
    }

    public static class TestedThread2 extends Thread {
        @Override
        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class TestedThread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class TestedThread4 extends Thread implements Message {
        boolean stop = true;

        @Override
        public void run() {
            while (stop) ;
        }

        @Override
        public void showWarning() {
            stop = false;
        }
    }

    public static class TestedThread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                while (true) {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(sum);
                        break;
                    }
                    sum += Integer.parseInt(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
