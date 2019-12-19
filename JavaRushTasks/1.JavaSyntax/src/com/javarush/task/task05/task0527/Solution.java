package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dogDog = new Dog("WoW", 23, 11);
        Cat catTom = new Cat("Tom", 1, 99);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        String name;
        int strength;
        int age;

        public Dog(String name, int strength, int age) {
            this.name = name;
            this.strength = strength;
            this.age = age;
        }
    }
    public static class Cat {
        String name;
        int bravery;
        int haste;

        public Cat(String name, int bravery, int haste) {
            this.name = name;
            this.bravery = bravery;
            this.haste = haste;
        }
    }

    //напишите тут ваш код
}
