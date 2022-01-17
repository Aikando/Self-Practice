package main.com.JavaHomework.Chapter10;

public class MyStringBuilder {
    private char[] e;
    private int length;

    public MyStringBuilder(String s) {

    }

    public void MyStringBuilder(String s) {
        length = s.length();
        e = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            e[i] = s.charAt(i);
    }

    public MyStringBuilder append(MyStringBuilder s) {
        return new MyStringBuilder(this.toString() + s.toString());
    }

    public MyStringBuilder append(int i) {
        return append(new MyStringBuilder(i + ""));
    }

    public int length() {
        return length;
    }

    public char charAt(int index) {
        if (index < length)
            return e[index];
        else {
            System.out.print("out!");
            return '@';
        }
    }

    public MyStringBuilder toLowerCase() {
        return new MyStringBuilder(this.toString().toLowerCase());
    }

    public MyStringBuilder substring(int begin, int end) {
        return new MyStringBuilder(this.toString().substring(begin, end));
    }

    public String toString() {
        return new String(e);
    }

}
