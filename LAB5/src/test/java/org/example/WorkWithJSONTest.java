package org.example;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class WorkWithJSONTest {
    @Test
    public void readJSON_test_1() {
        String test = "Vladislav Bobovoz 19 Elon Musk 51";
        ArrayList<Person> tmp = WorkWithJSON.ReadFromFileJSON("src/test/java/inputfiles/test1.json");
        String result = "";
        for(int i = 0; i < tmp.size(); ++i) {
            result += tmp.get(i).getFirstName() + " " + tmp.get(i).getLastName() + " " + tmp.get(i).getAge();
            if(i + 1 != tmp.size()) {
                result += " ";
            }
        }
        assertEquals(test, result);
    }

    @Test
    public void readJSON_test_2() {
        String test = "Vladislav Bobovoz 19";
        ArrayList<Person> tmp = WorkWithJSON.ReadFromFileJSON("src/test/java/inputfiles/test2.json");
        String result = "";
        for(int i = 0; i < tmp.size(); ++i) {
            result += tmp.get(i).getFirstName() + " " + tmp.get(i).getLastName() + " " + tmp.get(i).getAge();
            if(i + 1 != tmp.size()) {
                result += " ";
            }
        }
        assertEquals(test, result);
    }
}