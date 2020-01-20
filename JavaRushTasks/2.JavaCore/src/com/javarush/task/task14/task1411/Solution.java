package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = new ArrayList<>();
        do {
            key = reader.readLine();
            list.add(key);

        }
        while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"));

        {
            for (String s : list
            ) {
                switch (s) {
                    case "user":
                        person = new Person.User();
                        doWork(person);
                        break;
                    case "loser":
                        person = new Person.Loser();
                        doWork(person);
                        break;
                    case "coder":
                        person = new Person.Coder();
                        doWork(person);
                        break;
                    case "proger":
                        person = new Person.Proger();
                        doWork(person);
                        break;
                }
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) ((Person.User) person).live();
        else if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
