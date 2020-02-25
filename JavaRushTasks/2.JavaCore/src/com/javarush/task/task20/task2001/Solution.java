package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = new File("your_file_path");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();

            boolean bool = ivanov.equals(somePerson);
            System.out.println(bool);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream))) {
                String isPresent = name != null ? "Yes" : "No";
                pw.println(isPresent);
                pw.println(assets.size());
                if (isPresent.equals("Yes")) {
                    for (Asset asset : assets) {
                        pw.println(asset.getName());
                        pw.println(asset.getPrice());
                    }
                    pw.println(name);
                }
            }
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String isPresent = br.readLine();
                int size = Integer.parseInt(br.readLine());
                if (isPresent.equals("Yes")) {
                    List<Asset> list = new ArrayList<>(size);
                    for (int i = 0; i < size; i++) {
                        list.add(new Asset(br.readLine(), Double.parseDouble(br.readLine())));
                    }
                    assets = list;
                    name = br.readLine();
                }
            }
            //implement this method - реализуйте этот метод
        }
    }
}
