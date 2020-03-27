package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution {

    private static int countDirectories = 0;
    private static int countFiles = 0;
    private static long sizeOfAllFiles = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path folder = Paths.get(reader.readLine());
        reader.close();

        if (Files.isDirectory(folder)) {
            Files.walkFileTree(folder, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    countFiles++;
                    sizeOfAllFiles += attrs.size();
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    if (!dir.equals(folder)) {
                        countDirectories++;
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("Всего папок - " + countDirectories);
            System.out.println("Всего файлов - " + countFiles);
            System.out.println("Общий размер - " + sizeOfAllFiles);
        }
        else {
            System.out.println(folder.normalize().toAbsolutePath().toString() + " - не папка");
        }


    }
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            String filePath = reader.readLine();
//            File file = new File(filePath);
//            if (!file.isDirectory()) {
//                System.out.println(file.getAbsolutePath() + " - не папка");
//                reader.close();
//            }
//            else {
//                System.out.println("Всего папок - " + Files.walk(Paths.get(filePath))
//                        .filter(Files::isDirectory)
//                        .count());
//                System.out.println("Всего файлов - " + Files.walk(Paths.get(filePath))
//                        .filter(Files::isRegularFile)
//                        .count());
//                System.out.println("Общий размер - " + Files.walk(Paths.get(filePath))
//                        .filter(Files::isRegularFile)
//                        .mapToInt(Files::size)    //IOException
//                        .sum());
//            }
//        }
//    }
}
