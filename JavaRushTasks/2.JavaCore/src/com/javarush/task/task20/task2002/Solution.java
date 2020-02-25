package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("C:\\Users\\petuh\\Desktop\\2.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User user1 = new User();
            user1.setFirstName("Tom");
            user1.setLastName("HiddleStone");
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);
            user1.setBirthDate(new Date());
            javaRush.users.add(user1);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            boolean bool = javaRush.equals(loadedObject);
            System.out.println(bool);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream))) {
                String isPresent = users != null ? "Yes" : "No";
                pw.println(isPresent);
                pw.println(users.size());
                if (isPresent.equals("Yes")) {
                    for (User user : users) {
                        pw.println(user.getFirstName());
                        pw.println(user.getLastName());
                        pw.println(user.isMale() ? "Yes" : "No");
                        pw.println(user.getCountry().getDisplayName());
                        pw.println(user.getBirthDate().getTime());
                    }
                }
            }
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String isPresent = br.readLine();
                int size = Integer.parseInt(br.readLine());
                if (isPresent.equals("Yes")) {
                    List<User> usersList = new ArrayList<>(size);
                    for (int i = 0; i < size; i++) {
                        User user = new User();
                        user.setFirstName(br.readLine());
                        user.setLastName(br.readLine());
                        user.setMale(br.readLine().equals("Yes"));
                        String country = br.readLine();
                        user.setCountry(
                                country.equals("Russia") ? User.Country.RUSSIA :
                                        country.equals("Ukraine") ? User.Country.UKRAINE :
                                                User.Country.OTHER);
                        user.setBirthDate(new Date(Long.parseLong(br.readLine())));
                        usersList.add(user);
                    }
                    users = usersList;
                }
                //implement this method - реализуйте этот метод
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
