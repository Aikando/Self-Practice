package main.com.JavaHomework.Chapter12;

public class Task2 {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(2, 2, 5);
        } catch (IllegalTriangleException e) {
            System.out.println("Wrong!");
            System.out.println(e);
            System.exit(1);;
        }
    }

}

class IllegalTriangleException extends Exception {
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(double s1, double s2, double s3) {
        super("Invalid sides: " + s1 + " " + s2 + " " + s3);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        if (s1 < s2 + s3 && s2 < s1 + s3 && s3 < s1 + s2) {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
        } else
            throw new IllegalTriangleException(s1, s2, s3);
    }
}