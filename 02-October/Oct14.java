import java.util.Scanner;
public class Oct14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Prime factors:  ");
        for(int i =2;i<num;i++){
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }
        sc.close();
    }
}