package org.example;

import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class WorkWithXMLTest {

    @Test
    public void readXML_test_1() throws XMLStreamException, FileNotFoundException {
        String test = "Vladislav Bobovoz 19";
        ArrayList<Person> tmp = WorkWithXML.ReadFromFileXML("src/test/java/inputfiles/test1.xml");
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
    public void readXML_test_2() throws XMLStreamException, FileNotFoundException {
        String test = "Vladislav Bobovoz 19 Elon Musk 51";
        ArrayList<Person> tmp = WorkWithXML.ReadFromFileXML("src/test/java/inputfiles/test2.xml");
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