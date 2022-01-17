package main.com.JavaHomework.Chapter10;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int a = sc.nextInt();
        System.out.print("该数的所有素数因子是:");
        for (int i = 2; i <= a; ) {
            if (a % i == 0) {
                a = a / i;
                System.out.print(i + " ");
                i = 2;
            } else {
                i++;
            }
        }
    }
}



