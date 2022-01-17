package main.com.JavaHomework.Chapter10;

public class MyString {

    private char[] s;
    public void MyString1(char[] chars) {
        this.s = chars;
    }

    public MyString(char[] c) {
    }

    public char charAt(int index) {
        if (index < s.length)
            return s[index];
        else {
            System.out.print("out!");
            return '@';
        }
    }

    public int length() {
        return s.length;
    }

    public MyString substring(int begin, int end) {
        char[] s1 = new char[end - begin + 1];
        int a = 0;
        int b = 0;
        for (a = begin - 1; a < end; a++) {
            s[b] = s[a];
            b++;
        }
        MyString newString = new MyString(s1);
        return newString;
    }

    public MyString toLowerCase() {
        String str = String.valueOf(s);
        str.toLowerCase();
        char ss[] = str.toCharArray();
        MyString newString = new MyString(ss);
        return newString;
    }

    public boolean equals(MyString s) {
        return this.s.equals(s);
    }

    public static MyString valueOf(int i) {
        char[] c = new char[1];
        c[0] = (char) (i + (int) '0');
        MyString newString = new MyString(c);
        return newString;
    }


}


