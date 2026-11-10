class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI ");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Credit Card");
    }
}

class Cash extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}

public class Nov8 {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new Cash();
        p.pay();
    }
}
