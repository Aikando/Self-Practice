package main;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

//        for (int i = 1;i <= 9;i++){
//            for (int j = 1; j <=i;j++){
//                System.out.print(j + "*" + i +"="+ i*j+" ");
//            }
//            System.out.println("");
//        }

//        int[] score = new int[]{18,25,7,36,13,21,89,63};
//        int sum = 0;
//        int max = 0;
//        int count = 0;
//
//
//        for (int i = 0;i < score.length;i++){
//            sum += score[i];
//        }
//        System.out.println("平均积分是："+sum/score.length);
//
//        for (int i = 0;i < score.length;i++){
//            if (max < score[i]){
//                max = score[i];
//            };
//
//        }
//        System.out.println("最高积分是："+max);
//
//        for (int i = 0;i < score.length;i++){
//            if (score[i]>30){
//                count++;
//            }
//        }
//        System.out.println("积分大于30的顾客数量是："+ count +"人");


//        LocalTime t1 = LocalTime.now();
//        System.out.println(t1);
//
//        LocalDate t2 = LocalDate.now();
//        System.out.println(t2);
//
//        LocalDateTime t3 = LocalDateTime.now();
//        System.out.println(t3);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String now = dtf.format(t3);
//        System.out.println(now);
//
//        String str = "2021-08-29 07:30:40";
//        LocalDateTime time = LocalDateTime.parse(str,dtf);
//        System.out.println(time);


        List<String> st = new ArrayList<>();

        st.add("123");
        st.add("abc");

        System.out.println(st.size());

        String st1 = st.get(0);

        st.remove(st.size()-1);
        System.out.println(st.size());

        st.clear();
        System.out.println(st.size());


    }



}
