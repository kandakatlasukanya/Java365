
class Person {

    String name;
    int age;

    // Parent constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    int salary;

    // Child constructor
    Employee(String name, int age, int salary) {

        super(name, age); // Calling parent constructor

        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Nov3 {
    public static void main(String[] args) {

        Employee e = new Employee("Sukanya", 19 , 30000);

        e.display();
    }
}
