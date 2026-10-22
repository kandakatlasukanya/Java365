class Student {
    String name;
    int age;
    int marks;
    void setDetails(String name, int age, int marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    void checkResults()
    {
        if(marks >= 35)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }
    }
}
public class Oct22 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Sukanya", 19, 95);
        s1.displayDetails();
        s1.checkResults();
        
        System.out.println();
        
        Student s2 = new Student();
        s2.setDetails("Amaranth", 20,99);
        s2.displayDetails();
        s2.checkResults();
    }
}