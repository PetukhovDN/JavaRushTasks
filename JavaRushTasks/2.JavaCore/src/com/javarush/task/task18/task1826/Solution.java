package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(args[2]));
        switch (args[0]) {
            case "-e":
                while (bufferedInputStream.available() > 0) {
                    int data = bufferedInputStream.read();
                    bufferedOutputStream.write(data + 1);
                }
                bufferedInputStream.close();
                bufferedOutputStream.close();
                break;
            case "-d":
                while (bufferedInputStream.available() > 0) {
                    int data = bufferedInputStream.read();
                    bufferedOutputStream.write(data - 1);
                }
                bufferedInputStream.close();
                bufferedOutputStream.close();
                break;
        }

    }

}
