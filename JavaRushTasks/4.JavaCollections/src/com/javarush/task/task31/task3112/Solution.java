package com.javarush.task.task31.task3112;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL urlFile = new URL(urlString);
        InputStream inputStream = urlFile.openStream();
        Path temp = Files.createTempFile("TEMP", "file");
        Files.copy(inputStream, temp);
        Path newPath = Paths.get(downloadDirectory.toString() + "/" + new File(urlString).getName());
        Files.move(temp, newPath);
        return newPath;
    }
}
