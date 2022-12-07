package org.example;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static boolean isTrue(String text) {
        Pattern pattern = Pattern.compile("(\\d{7}[AB]\\d{3}( |)(PB|BA|BI)\\d [А-Я][а-я]+ РУВД Минск)|(\\d{7}C\\d{3}( |)(PB|BA|BI)\\d [А-Я][а-я]+ РУВД Брест)|(\\d{7}[K]\\d{3}( |)(PB|BA|BI)\\d [А-Я][а-я]+ РУВД Гродно)|(\\d{7}[E]\\d{3}( |)(PB|BA|BI)\\d [А-Я][а-я]+ РУВД Витебск)|(\\d{7}[M]\\d{3}( |)(PB|BA|BI)\\d [А-Я][а-я]+ РУВД Могилев)|(\\d{7}[H]\\d{3}( |)(PB|BA|BI)\\d [А-Я][а-я]+ РУВД Гомель)");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        Scanner scan = new Scanner(fr);

        while(scan.hasNextLine()) {
            fw.write(isTrue(scan.nextLine()) + "\n");
        }

        fr.close();
        fw.close();
    }
}