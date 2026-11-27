
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nov27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Write student details
            FileWriter fw = new FileWriter("student.txt");

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            fw.write("Student Name: " + name + "\n");
            fw.write("Roll Number: " + roll + "\n");
            fw.write("Marks: " + marks + "\n");

            fw.close();

            System.out.println("Student details written successfully!");

            // Append student details
            FileWriter fw2 = new FileWriter("student.txt", true);

            fw2.write("\nNew Student Details\n");
            fw2.write("Student Name: Rahul\n");
            fw2.write("Roll Number: 102\n");
            fw2.write("Marks: 90\n");

            fw2.close();

            System.out.println("Student details appended successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
