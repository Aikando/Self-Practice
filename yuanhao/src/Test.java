import java.util.ArrayList;

public class Test {


//    public static void main(String[] args) {
//        String str = "abc";
//        for (int i = 0; i < str.length(); i++) {
//            char str1 = str.charAt(i);
//            System.out.println(str1);
//        }
//
//
//
//    }
    public static ArrayList<Character> repeat(String str) {
        ArrayList<Character> result = new ArrayList<>();
        int[] exists = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (exists[c - 'a'] == 1) {
                result.add(c);
            }

            exists[c - 'a']++;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abcdkioudofanzdfpqwe";
        System.out.println(repeat(str));
    }
}

class YKDArrayList {

    // 此处需要声明一个数组，作为底层存储
    int[] array = new int[20];
    int size = 0;

    public YKDArrayList() {

//        因为还未学习插入，所以暂时内置数据
        this.array[0] = 1;
        this.array[1] = 10;
        this.array[2] = 30;
        this.size = 3;
    }
}
