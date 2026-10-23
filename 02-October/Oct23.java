class BankAccount {
    private double balance = 1000;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Oct23 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(500);
        b.displayBalance();
    }
}