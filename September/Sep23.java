import java.util.Scanner;
public class Sep23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = sc.nextInt();
        System.out.print("Enter second Number:");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping, First Number: " +a );
        System.out.println("After swapping, second Number: " +b);
    }
}