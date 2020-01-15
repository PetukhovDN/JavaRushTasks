package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int min = inputArray[0];
        int max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < min) min = inputArray[i];
            if (inputArray[i] > max) max = inputArray[i];
        }
        // напишите тут ваш код
        // Вариант через Stream
        /*
        int min = Arrays.stream(inputArray)
                .min()
                .getAsInt();
        int max = Arrays.stream(inputArray)
                .max()
                .getAsInt();
        return new Pair<Integer, Integer>(min, max);
         */
        return new Pair<Integer, Integer>(min, max);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
