package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws Exception {
        switch (args[0]) {
            case "-c":
                if (args[2].equals("м")) {
                    Person personMale = Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]));
                    allPeople.add(personMale);
                    System.out.println(allPeople.indexOf(personMale));
                    break;
                } else if (args[2].equals("ж")) {
                    Person personFemale = Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]));
                    allPeople.add(personFemale);
                    System.out.println(allPeople.indexOf(personFemale));
                    break;
                }
            case "-u":
                Person tmp1 = allPeople.get(Integer.parseInt(args[1]));
                tmp1.setName(args[2]);
                tmp1.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                tmp1.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                break;
            case "-d":
                Person tmp2 = allPeople.get(Integer.parseInt(args[1]));
                tmp2.setName(null);
                tmp2.setSex(null);
                tmp2.setBirthDate(null);
                break;
            case "-i":
                Person tmp3 = allPeople.get(Integer.parseInt(args[1]));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String s = tmp3.getSex().equals(Sex.MALE) ? "м" : "ж";
                System.out.println(tmp3.getName() + " " + s + " " + simpleDateFormat.format(tmp3.getBirthDate()));
                break;
        }
    }
}
