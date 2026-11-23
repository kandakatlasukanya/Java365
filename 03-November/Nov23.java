
class Nov23 {

    // throws keyword
    static void checkAge(int age) throws ArithmeticException {

        if (age < 18) {
            // throw keyword
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
