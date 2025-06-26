import java.io.*;
import java.util.*;

public class FileManager {
    static String filename = "students.txt";

    public static void saveToFile(ArrayList<Student> students) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            for (Student s : students) {
                writer.println(s.name + "," + s.rollNumber + "," + s.grade);
            }
            writer.close();
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    public static ArrayList<Student> loadFromFile() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");
                if (data.length == 3) {
                    String name = data[0];
                    int roll = Integer.parseInt(data[1]);
                    String grade = data[2];
                    list.add(new Student(name, roll, grade));
                }
            }
            sc.close();
            System.out.println("Data loaded from file.");
        } catch (IOException e) {
            System.out.println("File not found. No data loaded.");
        }
        return list;
    }
}
