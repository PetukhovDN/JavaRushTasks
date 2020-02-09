package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        FileInputStream f1 = new FileInputStream(filename1);
        FileOutputStream f2 = new FileOutputStream(filename2);
        FileOutputStream f3 = new FileOutputStream(filename3);

        int size = f1.available();
        int buffer = size % 2 == 0 ? size / 2 : (size + 1) / 2;
        while (f1.available() > 0) {
            byte[] a = new byte[buffer];
            byte[] b = new byte[size - buffer];

            f1.read(a);
            f1.read(b);
            f2.write(a);
            f3.write(b);
        }
        reader.close();
        f1.close();
        f2.close();
        f3.close();
    }
}
