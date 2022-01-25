package main.com.Algorithm;

public class BinarySearch {



        public static int find(int[] array, int aim) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (array[middle] == aim) {
                    return middle;
                } else if (array[middle] > aim) {
                    left = middle + 1;
                } else if (array[middle] < aim) {
                    right = middle - 1;
                }
            }
            return -1;

        }

        public static void main(String[] args) {
            int[] array = {100, 90, 80, 75, 22, 3, 2};
            int result1 = find(array, 22);
            if (result1 == -1) {
                System.out.println("22 不存在数组中");
            } else {
                System.out.println("22 存在数组中，索引值是 " + result1);
            }

            int result2 = find(array, 50);
            if (result2 == -1) {
                System.out.println("50 不存在数组中");
            } else {
                System.out.println("50 存在数组中，索引值是 " + result2);
            }
        }
    }

