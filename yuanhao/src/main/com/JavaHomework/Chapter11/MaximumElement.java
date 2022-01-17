package main.com.JavaHomework.Chapter11;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
        public static void main(String[] args) {
            int data[]=new int[105];
            Scanner input=new Scanner(System.in);
            System.out.println("Cin: (end by 0)");
            data[0]=input.nextInt();
            int flag=0;
            while(data[flag]!=0){
                flag++;
                data[flag]=input.nextInt();
            }
            flag--;
            int max=getMax(data);
            System.out.println("Max : "+ max);

            input.close();
        }

        public static int getMax(int[] data){
            return Arrays.stream(data).max().getAsInt();
        }
    }




