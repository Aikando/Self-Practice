package main.com.Algorithm;

import java.util.Arrays;


public class InsertSort {

    // Descending Order
    public static void insertSortUp(int[] array) {
        int len = array.length;
        for (int i = len - 2; i >= 0; i--) {
            int temp = array[i];
            for (int j = i + 1; j <= len - 1; j++) {
                if (temp < array[j]){
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //Ascending Order
    public static void insertSortDown(int[] array){
        int len = array.length;
        for (int i = 1; i <= len - 1; i++) {
            int temp = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp < array[j]){
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3};
        // Arrays.toString 可以方便打印数组内容
        System.out.println(Arrays.toString(array));
        insertSortUp(array);
        System.out.println(Arrays.toString(array));
        insertSortDown(array);
        System.out.println(Arrays.toString(array));
    }
}
