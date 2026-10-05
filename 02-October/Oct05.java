import java.util.Scanner;
public class Oct05 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int largest=0;
    while(n>0){
        int digit = n%10;
        if(digit>largest){
            largest= digit;
        }
        n=n/10;
    }
    System.out.println("Largest digit = " + largest);
    }
}