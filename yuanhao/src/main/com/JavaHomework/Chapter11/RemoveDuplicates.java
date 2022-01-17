package main.com.JavaHomework.Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers : ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(input.nextInt());
        removeDuplicate(list);
        System.out.print("The distinct integers are " + toString(list));
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            while (i != list.lastIndexOf(temp)) list.remove(list.lastIndexOf(temp));
        }
    }

    public static String toString(ArrayList<Integer> list) {
        StringBuilder str = new StringBuilder();
        for (Integer integer : list) {
            str.append(integer).append(" ");
        }
        return str.toString();
    }
}


