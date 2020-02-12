package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        while (!s.equals("exit")) {
            s = reader.readLine();
            new ReadThread(s).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                Map<Integer, Integer> map = new HashMap<>();
                FileInputStream fileInputStream = new FileInputStream(fileName);
                while (fileInputStream.available() > 0) {
                    while (fileInputStream.available() > 0) {
                        int data = fileInputStream.read();
                        map.merge(data, 1, Integer::sum);
                    }
                }
                int newData = 0;
                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    if (Collections.max(map.values()).equals(pair.getValue())) {
                        newData = pair.getKey();
                    }
                }
                synchronized (this) {
                    resultMap.put(fileName, newData);
                }
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

