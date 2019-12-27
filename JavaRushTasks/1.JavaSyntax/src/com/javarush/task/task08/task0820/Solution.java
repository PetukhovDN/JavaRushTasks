package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result1 = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result1.add(new Cat());
        }
        return result1;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result2 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            result2.add(new Dog());
        }
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for(Object pet: pets){
            System.out.println(pet);//напишите тут ваш код
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }
}
