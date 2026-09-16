import java.util.Scanner;
public class Sep16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int difference = a - b;
        if(difference < 0)
        {
            difference = - difference;
        }

        System.out.println(difference);
        sc.close();
    }
}
