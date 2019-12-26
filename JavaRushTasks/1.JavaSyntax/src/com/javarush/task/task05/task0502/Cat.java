package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int score1 = 0;
        int score2 = 0;
        if (this.age > anotherCat.age) score1++;
        else score2++;
        if (this.weight > anotherCat.weight) score1++;
        else score2++;
        if (this.strength > anotherCat.strength) score1++;
        else score2++;

        return score1 >= score2;
    }

    public static void main(String[] args) {

    }
}
