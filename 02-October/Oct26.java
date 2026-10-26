class Student {
    private int rollNumber;
    private String name;
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
}
public class Oct26 {
    public static void main(String[] args) {
        Student s = new Student(101, "Amarnath");
        System.out.println("Student Roll Number: " + s.getRollNumber());
        System.out.println("Student Name: " + s.getName());
    }
}