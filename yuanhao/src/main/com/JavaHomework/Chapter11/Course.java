package main.com.JavaHomework.Chapter11;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>(1);
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.set(numberOfStudents, student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudent() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

    }
}
class Test{
    public static void main(String[] args) {
        Course course = new Course("语文");
        course.addStudent("syh");
        course.addStudent("syh");
        System.out.println("课程: " + course.getCourseName());
    }
}
