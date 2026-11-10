
class Teacher {
    String name = "Jenny";

    void teach() {
        System.out.println(name + " is teaching");
    }
}

class Student {
    String name = "Sukanya";

    void learn(Teacher t) {
        System.out.println(name + " is learning from " + t.name);
    }
}

public class Nov10 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        Student s = new Student();

        t.teach();
        s.learn(t);
    }
}
