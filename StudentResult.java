import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects, total = 0;
        double average;

        System.out.print("Enter how many subjects: ");
        subjects = sc.nextInt();

        // Array not used for simplicity
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        average = total / (double) subjects;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");

        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}

