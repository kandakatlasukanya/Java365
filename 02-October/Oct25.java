class Student {
    private String name;
    private int age;
    private double marks;
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
}
public void setMarks(double marks){
    this.marks=marks;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public double getMarks(){
    return marks;
}
}
public class Oct25 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Amarnath");
        s.setAge(20);
        s.setMarks(85.5);
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
        System.out.println("Student Marks: " + s.getMarks());
    }
}