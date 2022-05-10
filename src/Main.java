public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(500.0, "DuMoines");

        System.out.println("Welcome Mr./Ms. " + bankAccount.accountHolder + ".  Your current balance is: " + bankAccount.accountBalance);

        double newFunds = bankAccount.deposit(100.0);
        bankAccount.printAccountSummary(newFunds);
    }
}