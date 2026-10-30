class Student{
    String name;
    static int count=0;
    Student(String name){
        this.name=name;
        count++;
    }
    void display(){
        System.out.println("Student Name: "+name);
    }
    static void displayCount(){
        System.out.println("Total Students: "+count);
    }
}
    public class Oct30 {
    public static void main(String[] args) {
        Student s1=new Student("Sukanya");
        s1.display();
        Student s2=new Student("Amarnath");
        s2.display();
        Student.displayCount();
    }
}
