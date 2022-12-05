package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithTXT {
    public static ArrayList<String> ReadFromFileTXT(String filename) {
        ArrayList<String> array = new ArrayList<>();
        try (FileReader reader = new FileReader(filename)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                array.add(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
}
