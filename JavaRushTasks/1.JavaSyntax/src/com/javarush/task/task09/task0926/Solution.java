package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] int1 = new int[]{3, 6, 34, 8, 1};
        int[] int2 = new int[]{23, 67};
        int[] int3 = new int[]{12, 56, 89, 234};
        int[] int4 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] int5 = new int[]{};
        list.add(int1);
        list.add(int2);
        list.add(int3);
        list.add(int4);
        list.add(int5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
