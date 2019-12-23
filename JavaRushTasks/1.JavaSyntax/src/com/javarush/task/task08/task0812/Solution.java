package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }
        List<Integer> listCounts = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {

                count = 1;
            }
            listCounts.add(count);
        }
        Collections.sort(listCounts, Collections.reverseOrder());
        System.out.println(listCounts.get(0));


    }
}