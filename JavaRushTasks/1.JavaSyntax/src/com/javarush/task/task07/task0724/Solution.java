package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human grandPa1 = new Human("Tom", true, 87);
        Human grandPa2 = new Human("Bob", true, 85);
        Human grandMa1 = new Human("Gretta", false, 79);
        Human grandMa2 = new Human("Sofya", false, 76);
        Human father = new Human("Charli", true, 53, grandPa1, grandMa1);
        Human mother = new Human("Merry", true, 49, grandPa2, grandMa2);
        Human child1 = new Human("Dick", true, 23, father, mother);
        Human child2 = new Human("Bill", true, 21, father, mother);
        Human child3 = new Human("Steve", true, 25, father, mother);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(grandPa1);
        humans.add(grandPa2);
        humans.add(grandMa1);
        humans.add(grandMa2);
        humans.add(father);
        humans.add(mother);
        humans.add(child1);
        humans.add(child2);
        humans.add(child3);
        for (Human s : humans) {
            System.out.println(s.toString());
        }

    }

    public static class Human {

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}