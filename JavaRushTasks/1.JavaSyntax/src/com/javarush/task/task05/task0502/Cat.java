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
        int catWin = 0;
        int anotherCatWin = 0;
        if (this.age > anotherCat.age) catWin++;
        else anotherCatWin++;
        if (this.strength > anotherCat.strength) catWin++;
        else anotherCatWin++;
        if (this.weight > anotherCat.weight) catWin++;
        else anotherCatWin++;
        return catWin > 2;
    }

    public static void main(String[] args) {

    }
}
