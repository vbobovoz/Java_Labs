package org.example;

import java.io.*;
import java.util.HashMap;

public class Singleton {
    private HashMap<String, Integer> hm = new HashMap<>();
    private static Singleton singletonInstance = null;
    private BufferedReader bufferedReader = null;
    private Singleton(String path) {
        try {
            File file = new File(path);
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static Singleton getInstance(String path) {
        if(singletonInstance == null) {
            singletonInstance = new Singleton(path);
        }
        return singletonInstance;
    }

    public HashMap getInfo() {
        String readLine = "";
        try {
            while((readLine = bufferedReader.readLine()) != null) {
                String type = readLine.substring(0, readLine.indexOf(" "));
                Integer num = Integer.parseInt(readLine.substring(readLine.indexOf(' ') + 1, readLine.length()));
                hm.put(type, num);
            }
            bufferedReader.close();
            return hm;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
