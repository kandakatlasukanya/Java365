class Employee {
    String name;
    int salary;

    Employee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
    class Manager extends Employee {

        Manager(String name, int salary) {
            super(name, salary);
        }
        @Override
        void display() {
            System.out.println("Manager Name: " + name);
            System.out.println("Manager Salary: " + salary);
        }

    }
    public class Oct29 {
        public static void main(String[] args) {
            Employee emp = new Employee("Sukanya", 50000);
            emp.display();
            Manager mgr = new Manager("Amarnath", 75000);
            mgr.display();
        }
    }