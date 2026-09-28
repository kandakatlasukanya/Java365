import java.util.Scanner;
public class Sep28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n;
        int cube = n * n * n;
        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);
        sc.close();
    }
}