
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount!");
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount)
            throws InsufficientBalanceException, InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Nov25 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.displayBalance();

            account.deposit(2000);

            account.withdraw(1000);

            account.withdraw(10000);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Thank you for banking!");
            account.displayBalance();
        }
    }
}
