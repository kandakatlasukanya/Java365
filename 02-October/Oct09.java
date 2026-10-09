import java.util.Scanner;

public class Oct09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive integer.");
        } else {
            System.out.print("Factors of " + n + ": ");

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}
