package main.com.Algorithm;
import java.util.Arrays;

public class SelectSort {

    // ascending
    public static void selectSortUp(int[] array) {

        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            int max_num = array[0];
            int max_index = 0;
            for (int j = 1; j < length - i; j++) {
                if (array[j] > max_num){
                    max_num = array[j];
                    max_index = j;

                }
            }
            int temp = array[max_index];
            array[max_index] = array[length-i-1];
            array[length-i-1] = temp;

        }

    }
    // Descending
    public static void selectSortDown(int[] array){
        for (int i = 0; i < array.length; i++) {
            int maxIndex = i;
            int maxNum = array[i];
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > maxNum){
                    maxNum = array[j];
                    maxIndex = j;
                }
            }
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3};
        // Arrays.toString 可以方便打印数组内容
        System.out.println(Arrays.toString(array));
        selectSortUp(array);
        System.out.println(Arrays.toString(array));
        selectSortDown(array);
        System.out.println(Arrays.toString(array));
    }
}
