
public class Nov20 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println(result);

            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        } 
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println("Program continues...");
    }
}
