class Student {
    int age;
    String name;
    String branch;
    double marks;
}
public class Oct20 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 19;
        s1.name = "Sukanya";
        s1.branch = "Computer Science";
        s1.marks = 95.5;

        System.out.println("Student Details:");
        System.out.println("Age: " + s1.age);
        System.out.println("Name: " + s1.name);
        System.out.println("Branch: " + s1.branch);
        System.out.println("Marks: " + s1.marks);
    }
}
