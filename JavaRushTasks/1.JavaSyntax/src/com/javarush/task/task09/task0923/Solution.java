package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String str = reader.readLine();
        char[] arr = str.replace(" ", "").toCharArray();
        List<Character> listVowels = new ArrayList<>();
        List<Character> listNotVowels = new ArrayList<>();
        for (Character c : arr) {
            if (isVowel(c)) {
                listVowels.add(c);
            } else {
                listNotVowels.add(c);
            }
        }
        for (Character c : listVowels) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (Character c : listNotVowels) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}