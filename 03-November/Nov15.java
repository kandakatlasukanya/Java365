
class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class CreditCard extends Payment {
    void cardPayment() {
        System.out.println("Payment using Credit Card");
    }
}

class UPI extends Payment {
    void upiPayment() {
        System.out.println("Payment using UPI");
    }
}

public class Nov15 {
    public static void main(String[] args) {

        // Upcasting
        Payment p = new CreditCard();

        p.pay();

        // Downcasting
        CreditCard c = (CreditCard) p;

        c.cardPayment();

        // Upcasting
        Payment p2 = new UPI();

        p2.pay();

        // Downcasting
        UPI u = (UPI) p2;

        u.upiPayment();
    }
}
