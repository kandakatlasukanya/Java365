
class BankAccount {

    final int accountNumber = 12345;
    String accountHolder = "Sukanya";
    double balance = 5000;

    final void displayAccount() {
        System.out.println(" Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Nov4 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.displayAccount();

        // Cannot change final variable
        // account.accountNumber = 67890;
    }
}
