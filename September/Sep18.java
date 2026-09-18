import java.util.Scanner;
public class Sep18{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();
    if(num % 10 == 0){
        System.out.println(num + " is divisible by 10");
    }
    else{
        System.out.println(num + " is not divisible by 10");
    }
    sc.close();
    }
 }
