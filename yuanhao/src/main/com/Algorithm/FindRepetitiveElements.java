package main.com.Algorithm;

import java.util.ArrayList;

public class FindRepetitiveElements {

    public static ArrayList<Character> repeat(String str) {
        ArrayList<Character> result = new ArrayList<>();
        int[] exists = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char cr = str.charAt(i);
            if (exists[cr - 'a'] == 1 ){
                result.add(cr);
            }
            exists[cr - 'a']++;

        }
        return result;
    }

    public static void main(String[] args) {
            String str = "abcdkioudofanzdfpqwe";
            System.out.println(repeat(str));
        }
    }


