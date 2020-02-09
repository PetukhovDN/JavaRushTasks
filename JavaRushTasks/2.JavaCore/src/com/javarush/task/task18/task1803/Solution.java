package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        List<Integer> list = new ArrayList<>(fileInputStream.available() + 1);
        List<Integer> list2 = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        int countMax = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (Integer integer : list) {
                if (list.get(i).equals(integer)) {
                    count++;
                }
            }
            if (count >= countMax) {
                countMax = count;
                if (!list2.contains(list.get(i))) {
                    list2.add(list.get(i));
                }
            }
        }
        reader.close();
        fileInputStream.close();
        for (Integer integer : list2) {
            System.out.print(integer);
            System.out.print(" ");
        }
    }
}

/*        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else map.put(data, 1);
        }

        int max = 0;
        for(Map.Entry entry: map.entrySet()) {
            if ((int) entry.getValue() > max) max = (int) entry.getValue();
        }

        for (Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(max)) System.out.print(entry.getKey() + " ");
        }
        reader.close();
        fileInputStream.close();
    }
}*/
