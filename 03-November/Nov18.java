
import java.util.Scanner;

public class Nov18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Program completed.");
        }

        sc.close();
    }
}
