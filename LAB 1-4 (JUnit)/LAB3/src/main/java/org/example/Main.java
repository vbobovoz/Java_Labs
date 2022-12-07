package org.example;

import java.util.*;

public class Main {
    public static boolean isNum(String str) {
        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNum(String str, int rad) {
        try {
            int num = Integer.parseInt(str, rad);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isPairOfSame(String str) {
        for(int i = 0; i < str.length(); ++i) {
            if(str.lastIndexOf(str.charAt(i)) > i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string of tokens: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string of separators: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter number to find: ");
        int find_num = scanner.nextInt();
        String[] words = new String[str1.length()];

        // SEPARATING
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
        System.out.println("---------------------------------");

        // PRINT ALL WORDS
        System.out.println("ALL WORDS: ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("---------------------------------");

        // SEPARATING DATA
        ArrayList<Integer> oct_numbers = new ArrayList<>();
        ArrayList<Integer> all_numbers = new ArrayList<>();
        ArrayList<String> sep_words = new ArrayList<>();
        for (String s : words) {
            if (isNum(s)) {
                if (isNum(s, 8)) {
                    oct_numbers.add(Integer.parseInt(s));
                }
                all_numbers.add(Integer.parseInt(s));
            } else if (!isNum(s)) {
                sep_words.add(s);
            }
        }

        // PRINT OCT NUMBERS
        System.out.println("OCT_NUMBERS: ");
        for (Integer num : oct_numbers) {
            System.out.println(num);
        }
        System.out.println("---------------------------------");

        // PRINT ALL NUMBERS
        System.out.println("ALL_NUMBERS: ");
        for(Integer num : all_numbers) {
            System.out.println(num);
        }
        System.out.println("---------------------------------");

        // PRINT WORDS
        System.out.println("SEP_WORDS: ");
        for(String str : sep_words) {
            System.out.println(str);
        }
        System.out.println("---------------------------------");

        // FIND AND PRINT SEP_WORDS
        System.out.println("SEP_WORDS WITH PAIR OF IDENTICAL CHARACTERS");
        System.out.println("AND EVEN NUMBER OF CHARACTERS: ");
        ArrayList<String> find_words = new ArrayList<>();
        for(String tstr : sep_words) {
            if(tstr.length() % 2 == 0 && isPairOfSame(tstr)) {
                find_words.add(tstr);
            }
        }
        for(String str : find_words) {
            System.out.println(str);
        }
        System.out.println("---------------------------------");

        // FIND P
        System.out.println("Index of FIND_NUM / STR1 + Math.random: ");
        int ind = -1;
        for(Integer num : all_numbers) {
            if(find_num == num) {
                ind = str1.indexOf(String.valueOf(find_num));
                System.out.println(ind);
            }
        }
        if(ind == -1) {
            int gen = (int)((Math.random() * (9 - 1)) + 1);
            System.out.println("Gen:" + gen);
            str1 = String.valueOf(gen) + str1;
            System.out.println(str1);
        }
        System.out.println("---------------------------------");

        // DELETE SMALLEST NUM SUBSTRING
        int smallest_substring_int = all_numbers.get(0);
        for(int num : all_numbers) {
            if(String.valueOf(num).length() < String.valueOf(smallest_substring_int).length()) {
                smallest_substring_int = num;
            }
        }
        System.out.println("Smallest substring: ");
        System.out.println(smallest_substring_int);
        System.out.println("Input string after replace: ");
        str1 = str1.replace(String.valueOf(smallest_substring_int), "");
        System.out.println(str1);
        System.out.println("---------------------------------");

        // LAMBDA COLLECTION SORT
        System.out.println("Lambda collections sort: ");
        Collections.sort(list, (o1, o2) -> String.valueOf(o1.charAt(0)).compareTo(String.valueOf(o2.charAt(0))));
        System.out.println(list);
    }
}

// 111121212121vlad12121121111helllo1212155511111119454211212177774444