
interface UPI {

    void pay(double amount);

}

class GooglePay implements UPI {

    public void pay(double amount) {
        System.out.println("Payment using Google Pay: Rs." + amount);
    }

}

class PhonePe implements UPI {

    public void pay(double amount) {
        System.out.println("Payment using PhonePe: Rs." + amount);
    }

}

public class Nov6 {

    public static void main(String[] args) {

        UPI payment;

        payment = new GooglePay();
        payment.pay(500);

        payment = new PhonePe();
        payment.pay(1000);

    }
}
