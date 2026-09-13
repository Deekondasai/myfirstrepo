// A class that demonstrates encapsulation
class BankAccount {
    // 1. Private variables - hidden from direct external access
    private String accountHolder;
    private double balance;

    // Constructor to initialize variables
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Reusing the setter to apply validation logic during initialization
        setBalance(initialBalance); 
    }

    // 2. Getter method for accountHolder (Read-only access)
    public String getAccountHolder() {
        return accountHolder;
    }

    // 3. Setter method for accountHolder (Write access)
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // 4. Getter method for balance
    public double getBalance() {
        return balance;
    }

    // 5. Setter method for balance with validation logic
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative!");
        }
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of BankAccount
        BankAccount account = new BankAccount("Alice", 1000.0);

        // Accessing data through public getter methods
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying data safely through public setter methods
        account.setBalance(1500.50);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Attempting to set an invalid negative balance
        System.out.println("\nTrying to set a negative balance...");
        account.setBalance(-500.0); // Will trigger validation warning
        System.out.println("Balance remains: $" + account.getBalance());
        
        // Note: account.balance = -500.0; would throw a compile-time error 
        // because the variable is private.
    }
}
}

