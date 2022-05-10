public class BankAccount {
    double accountBalance;
    String accountHolder;
    
    public BankAccount(double balance, String name) {
        accountBalance = balance;
        accountHolder = name;
    }

    public double deposit(double funds) {
        double newBalance = accountBalance + funds;
        return newBalance;
    }

    public double withdrawal(double expense) {
        double lessBalance = accountBalance - expense;
        return lessBalance;
    }

    public void printAccountSummary(double summary) {
        double newBalance = summary;
        if (newBalance > accountBalance) {
            System.out.println("Your new account balance: $" + newBalance);
        } else if (newBalance < accountBalance) {
            System.out.println("Your new account balance: $" + newBalance);
        }
    }
    
}
