public class Account {

    protected int accountNumber;
    protected double balance;

    // Constructor for Account class
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void Display_Account_Detail() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to get account balance
    public double getAccountBalance() {
        return balance;
    }
}

public class SavingsAccount extends Account {

    private double interestRate;

    // Constructor for SavingsAccount class
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override // Override the Display_Account_Detail method from Account class
    public void Display_Account_Detail() {
        super.Display_Account_Detail(); // Call the parent class method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class Main {

    public static void main(String[] args) {
        // Create an Account object
        Account account = new Account(12345, 1000.00);
        account.Display_Account_Detail();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(54321, 500.00, 2.5);
        savingsAccount.Display_Account_Detail();

        // Access balance using getter method
        System.out.println("Savings Account Balance: $" + savingsAccount.getAccountBalance());
    }
}
