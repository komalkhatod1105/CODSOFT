import java.util.*;

public class StudentManagementSystem {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNumber == rollNo) {
                students.remove(s);
                System.out.println("Student removed.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNumber == rollNo) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
