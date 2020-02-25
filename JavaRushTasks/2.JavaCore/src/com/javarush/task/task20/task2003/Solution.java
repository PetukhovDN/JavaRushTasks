package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (FileInputStream reader1 = new FileInputStream(reader.readLine())) {
                load(reader1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties props = new Properties();
        props.putAll(properties);
        props.store(outputStream, null);
        outputStream.close();
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        Properties props = new Properties();
        props.load(inputStream);
        properties.putAll((Map) props);
        inputStream.close();
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) {

    }
}
