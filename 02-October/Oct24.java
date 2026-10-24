class Employee {
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
}
    public class Oct24{
    public static void main(String[] args){
        Employee e1 = new Employee(100,"sukku",25000);
        e1.display();
    }
}
