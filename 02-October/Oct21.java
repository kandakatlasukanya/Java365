class Student {
    String name;
    int age;
    double marks;
    Student(String name, int age, double marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sukanya", 19, 95.5);
        Student s2 = new Student("Amaranth", 20, 99);
        
        s1.display();
        System.out.println();
        s2.display();
    }
}