package main.com.JavaHomework.Chapter11;

import java.util.*;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入三角形的三条边：");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();

        System.out.print("请输入三角形的颜色：");
        String color = input.next();

        System.out.print("该三角形是否填充(true/false)：");
        boolean filled = input.nextBoolean();

        GeometricObject object=new Triangle1(side1,side2,side3,color,filled);

        System.out.println("该三角形的面积为："+object.getArea());
        System.out.println("该三角形的周长为："+object.getPerimeter());
        System.out.println(object.toString());

    }

}

class Triangle1 extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle1() {

    }

    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle1(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3),0.5);
        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}
