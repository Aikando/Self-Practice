package main.com.DataStructure;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class AList {
    //Requirement1
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();
        list1.add("chinese");
        list1.add("english");
        list1.add("Math");
        list1.add("science");
        System.out.println(list1);

        //Requirement2
        list1.add(2,"X");
        //直接打印也可以
        System.out.println(list1);
        //也可以遍历
        for (int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }


        //Requirement3
       // list1.remove(2);
        //System.out.println(list1);

        //Requirement4
        int position1 = Search(list1);
        if(position1>0) {
            System.out.println("The position of X is:" + position1);
        }else{
            System.out.println("No find");
        }





        //Requirement5
        list1.add("chinese");
        list1.add("english");
        list1.add("Maths");
        list1.add("science");
        System.out.println(list1);
        LinkedHashSet set = new LinkedHashSet(list1);
        ArrayList list = new ArrayList(set);
        System.out.println(list);

        //Requirement6
        ArrayList sno = new ArrayList();
        ArrayList name = new ArrayList();
        ArrayList gender = new ArrayList();
        ArrayList collegeEnglish = new ArrayList();
        ArrayList advancedMathematics = new ArrayList();

        sno.add("2018001");
        sno.add("2018002");
        sno.add("2018003");
        sno.add("2018004");
        sno.add("2018005");
        sno.add("2018006");

        name.add("Alan");
        name.add("Danie");
        name.add("Helen");
        name.add("Bill");
        name.add("Peter");
        name.add("Amy");

        gender.add("F");
        gender.add("M");
        gender.add("M");
        gender.add("F");
        gender.add("M");
        gender.add("F");


        collegeEnglish.add("93");
        collegeEnglish.add("75");
        collegeEnglish.add("56");
        collegeEnglish.add("87");
        collegeEnglish.add("79");
        collegeEnglish.add("68");

        //(1)
        System.out.println(name.get(1));

        //(2)
        collegeEnglish.set(2,"100");
        System.out.println(collegeEnglish.get(2));

        //(3)
        sno.add(6,"2018007");
        name.add(6,"Tom");
        gender.add(6,"M");
        collegeEnglish.add(6,"100");
        advancedMathematics.add(6,99);

        //(4)
        sno.remove(2);
        name.remove(2);
        gender.remove(2);
        collegeEnglish.remove(2);
        advancedMathematics.remove(2);





    }

    public static  int Search(ArrayList list){

        int index =list.indexOf("X");
        return index;
    }




}
