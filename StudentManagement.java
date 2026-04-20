import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student(1, "Anitha"));
        students.add(new Student(2, "Rahul"));

        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s.id + " - " + s.name);
        }
    }
}