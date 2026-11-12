class Student {

    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;  // Default

    public void display() {

        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

public class Nov12 {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Public: " + s.a);

        // Private cannot be accessed directly
        // System.out.println(s.b);

        System.out.println("Protected: " + s.c);
        System.out.println("Default: " + s.d);

        s.display();
    }
}