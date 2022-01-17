package main.com.DataStructure;
import java.util.LinkedList;
public class Llist {
    public static void main(String[] args){
        //Requirement1.(1)
        LinkedList list1 = new LinkedList();
        list1.add("H&M");
        list1.add("NIKE");
        list1.add("CONVERSE");
        list1.add("AJ");
        System.out.println(list1);

        //Requirement1.(2)
        list1.add(1,"VANS");
        System.out.println(list1);

        //Requirement1.(3)
        list1.remove(1);
        System.out.println(list1);

        //Requirement1.(4)
        int position1 = list1.indexOf(1);
        if  (list1.get(1) == "VANS"){
            System.out.println(list1.get(1));
        }
        else {
            System.out.println("The element doesn't exist");

        }

        //Requirement2.(1)
     LinkedList<String> linklist = new LinkedList<>();
        String[] strs = {"1","2","3","4"};
        for (String string : strs) {
            linklist.add(string);
        }
//        for (int j = 0;j <= linklist.size();j++){
//            System.out.println(linklist.get(j));
//
//        }

        //Requirement2.(2)
        linklist.add(1,"X");
        System.out.println(linklist);

        //Requirement2.(3)
        linklist.remove(2);
        System.out.println(linklist);

        //Requirement2.(4)
        int position2 = find(linklist);
        if(position2>0) {
            System.out.println("The position of X is:" + position2);
        }else{
            System.out.println("No find");
        }

        //Application(1)
        System.out.println("5"+"6"+"7"+"8");
        LinkedList<String> linklist1 = new LinkedList<>();
        String[] strs1 = {"5","6","7","8"};
        for (String string : strs1) {
            linklist1.add(string);
        }

        //Application(2)
        System.out.println(linklist1);

        //Application(3)
        linklist1.add(1,"x");
        System.out.println(linklist1.size());


    }
    public static int find(LinkedList list){
        int index = list.indexOf("X");
        return index;

    }


}
