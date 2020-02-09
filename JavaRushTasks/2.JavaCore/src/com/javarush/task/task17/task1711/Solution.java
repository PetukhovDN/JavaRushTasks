package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            Person personMale = Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2]));
                            allPeople.add(personMale);
                            System.out.println(allPeople.indexOf(personMale));
                        } else if (args[i + 1].equals("ж")) {
                            Person personFemale = Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2]));
                            allPeople.add(personFemale);
                            System.out.println(allPeople.indexOf(personFemale));
                        }
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        Person tmp1 = allPeople.get(Integer.parseInt(args[i]));
                        tmp1.setName(args[i + 1]);
                        tmp1.setsex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                        tmp1.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]));
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person tmp2 = allPeople.get(Integer.parseInt(args[i]));
                        tmp2.setName(null);
                        tmp2.setsex(null);
                        tmp2.setBirthDate(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person tmp3 = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String s = tmp3.getSex().equals(Sex.MALE) ? "м" : "ж";
                        System.out.println(tmp3.getName() + " " + s + " " + simpleDateFormat.format(tmp3.getBirthDate()));
                    }
                    break;
                }
        }
    }
}