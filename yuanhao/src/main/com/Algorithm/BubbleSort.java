package main.com.Algorithm;

import java.util.Arrays;

/*
按照从左到右：小 --> 大 排列
 */
public class BubbleSort{

    public static void bubbleSortFromSmallToBig(int[] array) {
        // 1. 每次循环，都能冒泡出剩余元素中最大的元素，因此需要循环 array.length 次
        for (int i = 0; i < array.length; i++) {
            // 2. 每次遍历，只需要遍历 0 到 array.length - i - 1中元素，因此之后的元素都已经是最大的了
            for (int j = 0; j < array.length - i - 1; j++) {
                //3. 交换元素
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /*
    按照从左到右：大 --> 小 排列
     */
    public static void bubbleSortFromBigToSmall(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,7,1,5,8,3,6};
        //Array.toString()方法可以方便地打印出数组，不需要修改原有方法为有返回值类型的。
        System.out.println(Arrays.toString(arr));
        bubbleSortFromSmallToBig(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSortFromBigToSmall(arr);
        System.out.println(Arrays.toString(arr));

    }
}
