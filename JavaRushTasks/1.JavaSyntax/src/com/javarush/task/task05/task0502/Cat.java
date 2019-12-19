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
        int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
        int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
        int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

        int score = ageAdvantage + weightAdvantage + strengthAdvantage;
        return score > 2; // return score > 2 ? true : false;
    }

    public static void main(String[] args) {

    }
}
