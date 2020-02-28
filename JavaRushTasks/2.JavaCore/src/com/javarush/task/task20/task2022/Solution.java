package com.javarush.task.task20.task2022;

import java.io.*;

/*
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("path_to_file");
        Solution solution = new Solution(file.getPath());
        solution.writeObject("data");
        try (ObjectOutputStream oos = new ObjectOutputStream(solution.stream)) {
            oos.writeObject(solution);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Solution solution1 = (Solution) ois.readObject();
            solution1.writeObject("other data");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
