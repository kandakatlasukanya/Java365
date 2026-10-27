class Student {
    int id=101;
    String name="Amarnath";
    int age=20;
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}