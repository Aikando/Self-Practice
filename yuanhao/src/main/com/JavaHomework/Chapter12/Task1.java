package main.com.JavaHomework.Chapter12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] n = new int[100];
        for (int i = 0; i < n.length; i++)
            n[i] = (int) (Math.random() * 100);
        System.out.print("Enter your index: ");
        int index = input.nextInt();
        try {
            int n1 = n[index];
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Out of bounds!");
            System.exit(1);
        }
        System.out.println("The number of the index is " + n[index]);
    }

}
