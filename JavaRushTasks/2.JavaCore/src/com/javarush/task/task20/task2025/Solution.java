package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
Алгоритмы-числа
*/

/**
 * Работает верно, но слишком долго (простой перебор в лоб)
 * Валидатор не проходит
 */
public class Solution {
    public static long[] getNumbers(long N) {
        List<Long> list = new ArrayList<>();
        for (int i = 1; i < 10 ; i++) {
            list.add((long)i);
        }
        for (long i = 10; i < N; i++) {
            int length = String.valueOf(i).length();
            long sumOfDigits = Stream.of(String.valueOf(i)
                    .split(""))
                    .mapToInt(Integer::parseInt)
                    .map(x -> (int) Math.pow(x, length))
                    .sum();
            if (sumOfDigits == i) {
                list.add(i);
            }

        }
        for (long l: list
             ) {
            System.out.println(l);
        }

        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        getNumbers(9999999);
    }
}
