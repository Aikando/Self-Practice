package main.com.DataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //创建一个ArrayList类型的Stack
        Stack<ArrayList> st = new Stack<>();
        ArrayList al1 = new ArrayList();
        al1.add("张三");

        ArrayList al2 = new ArrayList();
        al2.add("李四");

        ArrayList al3 = new ArrayList();
        al3.add("王五");

        //入栈
        st.push(al1);
        System.out.println(st);

        st.push(al2);
        System.out.println(st);

        st.push(al3);
        System.out.println(st);


        //打印st的栈长度
        Size(st);
        System.out.println(st.size());

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.empty());


        System.out.println(pop(st));
        System.out.println(pop(st));

        System.out.println(isEmpty(st));

        System.out.println(peek(st));


    }

    //定义一个返回栈长度的方法
    public static int Size(Stack<ArrayList> st1) {
        return st1.size();

    }

    //定义一个方法pop，从栈里面取元素
    public static Object pop(Stack<ArrayList> st1) {
        int size = st1.size();
        if (!st1.isEmpty()) {
            Object t = st1.get(0);
            st1.remove(0);
            size--;
            return t;

        } else {
            System.out.println("该栈为空，返回为0!");
            return null;
        }

    }

    //判断栈是否为空
    public static boolean isEmpty(Stack<ArrayList> st1) {
        int size = st1.size();
        return st1.size() == 0;
    }

    //读取栈顶的元素
    public static Object peek(Stack<ArrayList> st1) {
        if (!st1.isEmpty()) {
            Object t = st1.get(0);
            return t;
        } else {
            System.out.println("该栈为空");
            return null;
        }
    }


}
