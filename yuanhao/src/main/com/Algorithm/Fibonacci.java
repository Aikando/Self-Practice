package main.com.Algorithm;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        System.out.println("fibonacci(1) = " + fibonacci(1));
        System.out.println("fibonacci(3) = " + fibonacci(3));
        System.out.println("fibonacci(10) = " + fibonacci(10));
    }
}
