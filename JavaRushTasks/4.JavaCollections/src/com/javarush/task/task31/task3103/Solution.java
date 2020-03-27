package com.javarush.task.task31.task3103;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/* 
Своя реализация
*/
public class Solution {
    public static byte[] readBytes(String fileName) throws IOException {
        return java.nio.file.Files.readAllBytes(new java.io.File(fileName).toPath());
    }

    public static List<String> readLines(String fileName) throws IOException {
        return java.nio.file.Files.readAllLines(new java.io.File(fileName).toPath());
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
        java.nio.file.Files.write(Paths.get(fileName), bytes);
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
        java.nio.file.Files.copy(Paths.get(resourceFileName), Paths.get(destinationFileName));
    }
}
