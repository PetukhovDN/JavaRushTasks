package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/*
Проход по дереву файлов
*/
public class Solution {

    public static void main(String[] args) {
        List<File> list = new ArrayList<>();
        File folder = new File(args[0]);
        File oldFile = new File(args[1]);
        File newFile = new File(oldFile.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(oldFile, newFile);
        File[] files = folder.listFiles();
        sortAndWrite(files, list);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            list.sort(new FileNameComparator());
            for (File str : list) {
                File file = new File(str.getAbsolutePath());
                BufferedReader reader = new BufferedReader(new FileReader(file));
                while (reader.ready()) {
                    writer.write(reader.readLine());
                }
                writer.write("\n");
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortAndWrite(File[] files, List<File> list) {
        for (File file1 : files) {
            if (!file1.isDirectory() && file1.length() <= (byte) 50) {
                list.add(file1);
            } else if (file1.isDirectory()) {
                sortAndWrite(Objects.requireNonNull(file1.listFiles()), list);
            }
        }
    }
}

class FileNameComparator implements Comparator<File> {
    public int compare(File first, File second) {
        return first.getName().compareTo(second.getName());
    }
}
