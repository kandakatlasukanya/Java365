import java.util.Scanner;
public class Sep22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println(a + " is the greatest number.");
        }
        else if(b > a && b > c){
            System.out.println(b + " is the greatest number.");
        }
        else if(c > a && c > b){
            System.out.println(c + " is the greatest number.");
        }
        else{
            System.out.println("All numbers are equal.");
        }
    }
}