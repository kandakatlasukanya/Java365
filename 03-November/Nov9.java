
class Processor {
    void startProcessor() {
        System.out.println("Processor is running");
    }
}

class Computer {
    private Processor processor;

    Computer() {
        processor = new Processor();
    }

    void startComputer() {
        processor.startProcessor();
        System.out.println("Computer is running");
    }
}

public class Nov9 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
