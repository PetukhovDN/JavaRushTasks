package com.javarush.task.task20.task2024;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("path_to_file"))) {
            Solution solution = new Solution();
            oos.writeObject(solution.node);
            for (Solution sol : solution.edges) {
                oos.writeObject(sol);
                oos.reset();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
