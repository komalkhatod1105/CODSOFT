import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Save to File");
            System.out.println("6. Load from File");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine(); // buffer clear
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter roll number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter grade: ");
                String grade = sc.nextLine();

                if (name.isEmpty() || grade.isEmpty()) {
                    System.out.println("Name and Grade cannot be empty.");
                } else {
                    Student s = new Student(name, roll, grade);
                    sms.addStudent(s);
                }

            } else if (choice == 2) {
                System.out.print("Enter roll number to remove: ");
                int roll = sc.nextInt();
                sms.removeStudent(roll);

            } else if (choice == 3) {
                System.out.print("Enter roll number to search: ");
                int roll = sc.nextInt();
                sms.searchStudent(roll);

            } else if (choice == 4) {
                sms.displayAll();

            } else if (choice == 5) {
                FileManager.saveToFile(sms.students);

            } else if (choice == 6) {
                sms.students = FileManager.loadFromFile();

            } else if (choice == 7) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
