import java.util.Scanner;
class Sep24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal:");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest:");
        double r = sc.nextDouble();
        System.out.print("Enter Time in Years:");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest is:" + si);
    
    }
}