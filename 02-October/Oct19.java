import java.util.Scanner;
public class Oct19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int binary = 0;
        int place = 1;
        while(n>0){
            int rem = n%2;
            binary += rem*place;
            n/=2;
            place*=10;
        }
        System.out.println("Binary equivalent: " + binary);
        sc.close();
    }
}