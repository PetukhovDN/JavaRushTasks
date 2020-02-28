package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
Алгоритмы-числа
*/

/**
 * Работает, но слишком долго (простой перебор в лоб)
 */
public class Solution {
    public static long[] getNumbers(long N) {
        System.out.println(String.valueOf(Long.MAX_VALUE).length());
        List<Long> list = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            int length = String.valueOf(i).length();
            long sumOfDigits = Stream.of(String.valueOf(i)
                    .split(""))
                    .mapToInt(Integer::parseInt)
                    .map(x -> (int) Math.pow(x, length))
                    .sum();
            if (sumOfDigits == i) {
                list.add(sumOfDigits);
            }

        }
        for (long l : list
        ) {
            System.out.println(l);

        }
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }
    public static boolean isNarc(long x){
        if(x < 0) return false;

        String xStr = Long.toString(x);
        int m = xStr.length();
        long sum = 0;

        for(char c : xStr.toCharArray()){
            sum += Math.pow(Character.digit(c, 10), m);
        }
        return sum == x;
    }

    public static void main(String[] args) {
        getNumbers(8209);
    }
}
