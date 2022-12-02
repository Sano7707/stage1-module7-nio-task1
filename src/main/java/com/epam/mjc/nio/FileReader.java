package com.epam.mjc.nio;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String name = "";
        int age = 0;
        String email = "";
        long phone = 0;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
           name = bf.readLine().substring(6);
           age = Integer.parseInt(bf.readLine().substring(5));
           email = bf.readLine().substring(7);
           phone = Long.parseLong(bf.readLine().substring(7));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return new Profile(name,age,email,phone);
    }
}
