class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Oct31 {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.drive();
        c.stop();
    }
}