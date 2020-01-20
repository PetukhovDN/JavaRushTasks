package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object object = new Integer(0);
            System.out.println((String) object);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s.trim();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            String s = "";
            s.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int[] n = new int[6];
            n[7] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }


        try {
            String s = "some string";
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("not real file");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Object objects[] = new String[5];
            objects[2] = new Integer(200);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[-10];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException(); //we can throw exception in every try-catch
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
    }
}