package main.com.JavaHomework.Chapter12;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws Exception {
        int[] alphabet = new int[26];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String s = input.next();
        File file = new File(s);
        if(!file.exists()){
            System.out.println("Not Exist!");
            System.exit(1);
        }
        Scanner output = new Scanner(file);
        while(output.hasNextLine()){
            String l = output.nextLine().toUpperCase();
            for(int i=0;i<l.length();i++)
                if(Character.isLetter(l.charAt(i)))
                    alphabet[l.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++)
            System.out.println("Number of "+(char)(i+'A')+"s: "+alphabet[i]);
    }

}
