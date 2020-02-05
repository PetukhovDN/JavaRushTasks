package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader reader1 = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(reader.readLine()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader1.readLine()) != null) {
                allLines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedReader reader2 = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(reader.readLine()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader2.readLine()) != null) {
                forRemoveLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
