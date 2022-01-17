package main.com.JavaHomework.Chapter10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Course course1 = new Course("Java程序设计");
        course1.addStudents("张三");
        course1.addStudents("李四");
        course1.addStudents("王五");
        List<String> students = course1.getStudents();
        System.out.println("course1的学生人数: " + students.size());
        System.out.print(students.get(0));
        for (int i = 1; i < students.size(); i++) {
            System.out.print(", " + students.get(i));
        }
        course1.dropStudents("张三");
        System.out.println("\ncourse1的学生人数: " + students.size());
        System.out.print(students.get(0));
        for (int i = 1; i < students.size(); i++) {
            System.out.print(", " + students.get(i));
        }
    }

    public static class Course {
        private String courseName;
        private ArrayList<String> students = new ArrayList<String>();
        private int numOfStudents;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }

        public void addStudents(String student) {
            students.add(student);
        }

        public ArrayList<String> getStudents() {
            return students;
        }

        public int getNumberOfStudents() {
            return students.size();
        }

        public void dropStudents(String student) {
            students.remove(student);
        }

        public void clear() {
            students.clear();
        }

    }
}


