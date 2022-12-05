package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WorkWithJSON {
    public static ArrayList<Person> ReadFromFileJSON(String filename) {
        ArrayList<Person> people = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        try {
            JSONArray list = (JSONArray) jsonParser.parse(new FileReader(filename));
            for(int i = 0; i < list.size(); ++i) {
                JSONObject object = (JSONObject) list.get(i);
                String firstName = (String) object.get("firstName");
                String lastName = (String) object.get("lastName");
                String age = (String) object.get("age");
                Person person = new Person(firstName, lastName, age);
                people.add(person);
            }
        } catch (IOException | org.json.simple.parser.ParseException ex) {
            throw new RuntimeException(ex);
        }
        return people;
    }

    public static void WriteInFileJSON(ArrayList<Person> p) throws IOException {
        FileWriter writer = new FileWriter("out_file.json");
        JSONArray obj = new JSONArray();
        writer.write("[ ");
        for(int i = 0; i < p.size(); ++i) {
            if(i + 1 == p.size()) {
                JSONObject object = new JSONObject();
                object.put("firstName", p.get(i).getFirstName());
                object.put("lastName", p.get(i).getLastName());
                object.put("age", p.get(i).getAge());
                writer.write(object.toJSONString());
                break;
            }
            JSONObject object = new JSONObject();
            object.put("firstName", p.get(i).getFirstName());
            object.put("lastName", p.get(i).getLastName());
            object.put("age", p.get(i).getAge());
            writer.write(object.toJSONString() + ", ");
        }
        writer.write(" ]");
        writer.flush();
    }
}
