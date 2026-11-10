class Parent {
    int a = 10;
}

class Child extends Parent {
    int a = 20;

    void display() {
        System.out.println("Parent field: "+ super.a);
        System.out.println("Child field: " + a);
    }
}

public class Nov2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
