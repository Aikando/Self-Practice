package main.com.Algorithm;
import java.util.ArrayList;


public class BinarySearch_2 {

        public static int find(ArrayList<String> array, String aim) {
            int left = 0;
            int right = array.size() - 1;

            while(left <= right){
                int middle = (left + right) / 2;
                if (array.get(middle).equals(aim)){
                    return middle;
                }
                else if (array.get(middle).compareTo(aim) < 0){
                    left = middle + 1;
                }
                else if(array.get(middle).compareTo(aim) > 0){
                    right = middle - 1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            ArrayList<String> array = new ArrayList<>();
            array.add("Allen");
            array.add("Emma");
            array.add("James");
            array.add("Jeanne");
            array.add("Kelly");
            array.add("Kevin");
            array.add("Mary");
            array.add("Natasha");
            array.add("Olivia");
            array.add("Rose");

            int result1 = find(array, "Kelly");
            if (result1 == -1) {
                System.out.println("Kelly 不存在名单中");
            } else {
                System.out.println("Kelly 存在名单中，位置是 " + result1);
            }

            int result2 = find(array, "Edith");
            if (result2 == -1) {
                System.out.println("Edith 不存在名单中");
            } else {
                System.out.println("Edith 存在名单中，位置是 " + result2);
            }
        }
    }


