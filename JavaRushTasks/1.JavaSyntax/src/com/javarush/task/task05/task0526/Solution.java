package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vasek", 33, "Vorovskogo 20");
        Man man2 = new Man("Vovan", 35, "Vorovskogo 14");
        Woman woman1 = new Woman("Lariska", 29, "Vorovskogo 11");
        Woman woman2 = new Woman("Mashka", 28, "Vorovskogo 27");

        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    public static class Man {
        String name;
        int age;
        String address;

        public String toString() { return this.name + " " + this.age + " " + this.address;  }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;

        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
