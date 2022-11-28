import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

class WorkWithTXT {
    public static TreeMap<Integer, String> ReadFromFileTXT() {
        TreeMap<Integer, String> map = new TreeMap<>();
        try(FileReader reader = new FileReader("in_file.txt")) {
            Scanner scanner = new Scanner(reader);
            Integer i = 0;
            while(scanner.hasNextLine()) {
                map.put(i, scanner.nextLine());
                ++i;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return map;
    }

    public static void WriteInFileTXT(TreeMap<Integer, String> map) {
        try(FileWriter writer = new FileWriter("out_file.txt")) {
            for(int i = 0; i < map.size(); ++i) {
                writer.write(map.get(i) + " ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

public class main {
    public static void main(String[] args) {
        TreeMap<Integer, String> read_map = new TreeMap<>();
        read_map = WorkWithTXT.ReadFromFileTXT();
        WorkWithTXT.WriteInFileTXT(read_map);
    }
}
