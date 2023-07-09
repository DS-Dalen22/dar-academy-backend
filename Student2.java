package basics;
import java.util.ArrayList;
import java.util.List;

public class Student2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(69));
        students.add(new Student(95));
        students.add(new Student(70));

        for (Student student : students) {
            System.out.println("Grade: " + student.getGrade());
        }
    }
}
