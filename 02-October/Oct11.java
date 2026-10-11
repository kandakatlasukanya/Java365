import java.util.Scanner;
public class Oct11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a > b) ? a : b;
        while(true){
            if(lcm % a == 0 && lcm % b == 0){
            break;
        }
        lcm++;
    }
    System.out.println("LCM="+lcm);
    sc.close();
    }
}