package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children1 = new ArrayList<>();
        Human child1 = new Human("Bob", true, 16, children1);
        Human child2 = new Human("Baks", true, 13, children1);
        Human child3 = new Human("Bib", false, 12, children1);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human dad = new Human("Tim", true, 54, children);
        Human mom = new Human("Tamara", false, 48, children);
        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(dad);
        ArrayList<Human> children3 = new ArrayList<>();
        children3.add(mom);
        Human grandPa1 = new Human("David", true, 87, children2);//напишите тут ваш код
        Human grandPa2 = new Human("Tom", true, 83, children3);
        Human grandMa1 = new Human("Dina", false, 83, children2);
        Human grandMa2 = new Human("Daria", false, 83, children3);

        System.out.println(grandPa1.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(grandMa2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;//напишите тут ваш код
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
