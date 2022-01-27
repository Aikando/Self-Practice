package main.com.Algorithm;
import java.util.Arrays;

public class SelectSort {

    // 选择排序
    public static void selectSort(int[] array) {

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

    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3};
        // Arrays.toString 可以方便打印数组内容
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
