import java.util.Scanner;
public class Sep17{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if(n % 3 == 0 && n % 5 == 0)
    {
        System.out.println("Divisible by both 3 and 5");
    }
    else
    {
        System.out.println("Not divisible by both 3 and 5");
    }
  }
}