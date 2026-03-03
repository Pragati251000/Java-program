// Custom Exceptions
class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

// BankAccount Class
class BankAccount {
    double balance = 5000;

    void balanceEnquiry() {
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Negative amount not allowed");
        balance += amount;
    }

    void withdraw(double amount) 
            throws LowBalanceException, NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Negative amount not allowed");
        if (amount > balance)
            throw new LowBalanceException("Low Balance");
        balance -= amount;
    }
}

// Main Class
public class BankDemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        try {
            b.balanceEnquiry();
            b.deposit(1000);
            b.withdraw(7000);   // Will throw exception
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        b.balanceEnquiry();
    }
}