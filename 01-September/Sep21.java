import java.util.Scanner;
public class Sep21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            System.out.println(a + " is greater than " +b);
        }
        else if(a < b){
            System.out.println(a + " is less than " +b);
        }
        else{
            System.out.println(a + " is equal to" +b);
        }
    }
}