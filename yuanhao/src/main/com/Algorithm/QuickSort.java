package main.com.Algorithm;

import java.util.Arrays;

public class QuickSort {


    /**
     * @author youkeda
     */
    public static void quickSort(int[] array) {
        // 调用快速排序的核心，传入left，right
        quickSortCore(array, 0, array.length - 1);
    }

    // 快速排序的核心，同样也是递归函数
    public static void quickSortCore(int[] array, int left, int right) {
        // 递归基准条件，left >= right 即表示数组只有1个或者0个元素。
        if (left >= right) {
            return;
        }
        // 根据轴分区
        int pivotIndex = partition(array, left, right);

        // 递归调用左侧和右侧数组分区
        quickSortCore(array, left, pivotIndex - 1);
        quickSortCore(array, pivotIndex + 1, right);
    }

    // 对数组进行分区，并返回当前轴所在的位置
    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];

        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            // 左指针移动
            while (array[leftIndex] <= pivot && leftIndex < right) {
                leftIndex++;
            }
            // 右指针移动
            while (array[rightIndex] >= pivot && rightIndex > 0) {
                rightIndex--;
            }

            if (leftIndex >= rightIndex) {
                break;
            } else {
                swap(array, leftIndex, rightIndex);
            }
        }

        swap(array, leftIndex, right);
        return leftIndex;
    }

    // 调换两个元素的位置
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    /**
     * @author shangguigu
     */

    public static void quickSort(int[] arr, int left, int right) {
        int l = left; //左下标
        int r = right; //右下标
        // pivot 中轴值
        int pivot = arr[(left + right) / 2];
        /*
        while循环的目的是让比 pivot 小的值放在左边，
        比 pivot 大的值放在右边
         */
        while (l < r) {
            // 在 pivot 左边一直找到 >=pivot 的值后退出
            while (arr[l] < pivot) {
                l++;
            }
            // 在 pivot 右边一直找到 <=pivot 的值后退出
            while (arr[r] > pivot) {
                r--;
            }
            // 如果 l >= r, 那么说明 pivot 左边全是比 pivot 小的
            // 右边都是比 pivot 大的
            if (l >= r) {
                break;
            }
            swap(arr, l, r);

            // 如果交换完后，发现这个 arr[l] == pivot，r前移
            if (arr[l] == pivot) {
                r--;
            }
            // 如果交换完后，发现这个 arr[r] == pivot，l后移
            if (arr[r] == pivot) {
                l++;
            }
        }

         //如果 l == r,必须 l++, r--, 否则会出现栈溢出
        if (l == r) {
            l++;
            r--;
        }
        // 向左递归
        if (left < r) {
            quickSort(arr, left, r);
        }
        // 向右递归
        if (right > l) {
            quickSort(arr, l, right);
        }

    }

    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 5, 3};
        // Arrays.toString 可以方便打印数组内容
        System.out.println("raw: " + Arrays.toString(array));
        quickSort(array);
        System.out.println("result: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
