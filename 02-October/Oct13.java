import java.util.Scanner;
public class Oct13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        for(int num=start;num<=end;num++){
            boolean isPrime = true;
            if(num<2){
                isPrime=false;
            }else{
                for(int i=2;i<=num/i;i++){
                    if(num%i==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }
        sc.close();
    }

}