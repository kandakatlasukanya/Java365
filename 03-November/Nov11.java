
class Professor {
    String name;
    int id;

    Professor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Professor Name: " + name);
        System.out.println("Professor ID: " + id);
    }
}

class Department {
    String deptName;
    Professor professor;

    Department(String deptName, Professor professor) {
        this.deptName = deptName;
        this.professor = professor;
    }

    void display() {
        System.out.println("Department: " + deptName);
        professor.display();
    }
}

public class Nov11 {
    public static void main(String[] args) {

        Professor p = new Professor("Ravi", 101);

        Department d = new Department("CSD", p);

        d.display();
    }
}
