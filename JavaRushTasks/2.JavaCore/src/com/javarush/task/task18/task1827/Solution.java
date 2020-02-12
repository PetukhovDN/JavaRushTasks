package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) throws Exception {
        if (args.length < 4 || !args[0].equals("-c")) return;
        float price;
        int qty;

        try {
            price = Float.parseFloat(args[args.length - 2]);
            qty = Integer.parseInt(args[args.length - 1]);
        } catch (NumberFormatException e) {
            return;
        }

        String productName;
        if (args.length > 4) {
            StringBuffer buf = new StringBuffer();
            for (int i = 1; i < args.length - 2; i++)
                buf.append(args[i]).append(" ");
            productName = buf.substring(0, buf.length() - 1);
        } else
            productName = args[1];

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        consoleReader.close();

        List<String> lines = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            while (fileReader.ready())
                lines.add(fileReader.readLine());
        }

        Pattern p = Pattern.compile("([0-9]{1,8})");
        int maxID = 0;
        for (String s : lines) {
            Matcher m = p.matcher(s);
            if (m.lookingAt()) {
                try {
                    int id = Integer.parseInt(s.substring(m.start(), m.end()));
                    if (id > maxID)
                        maxID = id;
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }

        if (maxID++ == 99999999)
            return;
        String toFile = String.format(Locale.ROOT, "%-8d%-30s%-8.2f%-4d", maxID, productName, price, qty);

        lines.add(toFile);
        try (BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            for (String s : lines)
                buf.write(s + "\r\n");
        }
    }
}

/**
 * Код снизу работает верно но не пропускается.
 * А может и неверно работает - раз не пропускается.
 */
/*public class Solution {
    public static void main(String[] args) throws Exception {
        if (!args[0].equals("-c") || args.length < 4) return;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        reader.close();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        int i = 0;
        while (reader1.ready()) {
            String s = reader1.readLine();
            String s2 = s.substring(0, 8).trim();
            if (Integer.parseInt(s2) > i) {
                i = Integer.parseInt(s2);
            }
        }
        reader1.close();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
        StringBuilder builder = new StringBuilder();
            for (int j = 1; j < args.length - 2; j++) {
                builder.append(args[j]);
            }
        String s = String.format("%-8d%-30s%-8.2f%-4d%n", ++i, builder.toString(), Float.parseFloat(args[args.length - 2]), Integer.parseInt(args[args.length - 1]));
        bufferedOutputStream.write(s.getBytes());
        bufferedOutputStream.close();
    }
}*/

