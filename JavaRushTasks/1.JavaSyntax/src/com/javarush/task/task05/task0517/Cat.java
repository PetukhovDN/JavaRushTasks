package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int weight = 5;
    int age = 7;
    String color = "Black";
    String address;//напишите тут ваш код

    public Cat(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
