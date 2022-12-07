package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    @Test
    public void test_1() {
        String str1 = "123Hello123my111name222is333Vlad";
        String str2 = "123";
        String[] words = new String[str1.length()];
        if(str2.length() == 1) {
            words = str1.split(str2);
        }
        else {
            StringTokenizer string_tokenizer = new StringTokenizer(str1, str2);
            int i = 0;
            while (string_tokenizer.hasMoreTokens()) {
                words[i] = string_tokenizer.nextToken();
                i++;
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(words));
        list.removeAll(Arrays.asList("", null));
        words = list.toArray(new String[0]);

        String expectation[] = { "Hello", "my", "name", "is", "Vlad" };

        assertArrayEquals(expectation, words);
    }

    @Test
    public void test_2() {
        String str1 = "aaa1a1aBSUa11111FAMCS";
        String str2 = "1a";
        String[] words = new String[str1.length()];
        if(str2.length() == 1) {
            words = str1.split(str2);
        }
        else {
            StringTokenizer string_tokenizer = new StringTokenizer(str1, str2);
            int i = 0;
            while (string_tokenizer.hasMoreTokens()) {
                words[i] = string_tokenizer.nextToken();
                i++;
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(words));
        list.removeAll(Arrays.asList("", null));
        words = list.toArray(new String[0]);

        String expectation[] = { "BSU", "FAMCS" };

        assertArrayEquals(expectation, words);
    }

    @Test
    public void test_3() {
        String str1 = "b";
        String str2 = "b";
        String[] words = new String[str1.length()];
        if(str2.length() == 1) {
            words = str1.split(str2);
        }
        else {
            StringTokenizer string_tokenizer = new StringTokenizer(str1, str2);
            int i = 0;
            while (string_tokenizer.hasMoreTokens()) {
                words[i] = string_tokenizer.nextToken();
                i++;
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(words));
        list.removeAll(Arrays.asList("", null));
        words = list.toArray(new String[0]);

        String expectation[] = { };

        assertArrayEquals(expectation, words);
    }
}

