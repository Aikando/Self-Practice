package Mydemo;

import java.util.Arrays;

public class MergeSort_Demo {
    public static int[] merge(int[] array){
        if (array.length == 1){
            return array;
        }

        int middle = array.length / 2;
        int[] left = merge(subArray(array, 0, middle));
        int[] right = merge(subArray(array, middle, array.length));

        int l = 0;
        int r = 0;
        int pointer = 0;

        while (l < left.length && r < right.length){
            array[pointer] = Math.min(left[l], right[r]);
            pointer++;

            if (left[l] < right[r]){
                l++;
            }
            else{
                r++;
            }
        }
        // 左边数组有剩余，右边全部填入
        if (l < left.length){
            for (int i = l; i < left.length; i++) {
                array[pointer] = left[i];
                pointer++;
            }

        }

        // 右边数组有剩余，左边全部填入
        if (r < right.length){
            for (int i = r; i < right.length; i++) {
                array[pointer] = right[i];
                pointer++;
            }

        }


        return array;
    }

    public static int[] subArray(int[] origin, int left, int right){
        int[] copy = new int[right - left];

        // 这里应该是 i < right, 不是 i < origin.length.
        for (int i = left; i < right; i++) {
            copy[i - left] = origin[i];
        }
        return copy;

    }

    public static void main(String[] args) {
        int[] array = new int[]{9,2,4,7,5,3};
        System.out.println(Arrays.toString(array));
        merge(array);
        System.out.println(Arrays.toString(array));
    }
}
