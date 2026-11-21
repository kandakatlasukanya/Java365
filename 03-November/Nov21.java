
public class Nov21 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            try {
                int result = a / b;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            int[] arr = {10, 20, 30};

            try {
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index");
            }
        }
        catch (Exception e) {
            System.out.println("Outer catch block executed");
        }

        System.out.println("Program continues...");
    }
}
