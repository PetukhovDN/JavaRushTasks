package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;// Напишите тут ваши переменные и конструкторы
        private String name;
        private int weight;
        private int height;
        private boolean sex;
        private String address;

        public Human(int age) {
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, String name, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }

        public Human(int age, int height, boolean sex) {
            this.age = age;
            this.height = height;
            this.sex = sex;
        }

        public Human(int height, boolean sex, String address) {
            this.height = height;
            this.sex = sex;
            this.address = address;
        }

        public Human(int age, String name, int weight, int height) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, String name, int weight, int height, boolean sex) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(int age, String name, int weight, int height, boolean sex, String address) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
            this.address = address;
        }
    }
}
