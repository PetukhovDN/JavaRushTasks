package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg[] zergs = new Zerg[5];
        for (int i = 0; i < 5; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = "Zerg" + i;
        }

        Protoss[] protosses = new Protoss[3];
        for (int i = 0; i < 3; i++) {
            protosses[i] = new Protoss();
            protosses[i].name = "Protoss" + i;
        }

        Terran[] terrans = new Terran[4];
        for (int i = 0; i < 4; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "Terran" + i;
        }


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
