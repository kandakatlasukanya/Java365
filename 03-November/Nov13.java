package mypackage;

public class Student {

    public void display() {
        System.out.println("Hello Student");
        System.out.println("Welcome to Java Packages");
    }
}
import mypackage.Student;

public class Test {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}