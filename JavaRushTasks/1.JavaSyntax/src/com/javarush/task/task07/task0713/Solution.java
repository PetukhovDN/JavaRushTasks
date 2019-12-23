package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listDel3 = new ArrayList<>();
        ArrayList<Integer> listDel2 = new ArrayList<>();
        ArrayList<Integer> listDel1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer % 6 == 0) {
                listDel3.add(integer);
                listDel2.add(integer);
            } else if (integer % 3 == 0) listDel3.add(integer);
            else if (integer % 2 == 0) listDel2.add(integer);
            else listDel1.add(integer);
        }
        printList(listDel3);
        printList(listDel2);
        printList(listDel1);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);//напишите тут ваш код
        }
    }
}
