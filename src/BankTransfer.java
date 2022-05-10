public class BankTransfer {
    double highValueAccount;
    double brokeBoiAccount;

    public BankTransfer(double richy, double brokie) {
        highValueAccount = richy;
        brokeBoiAccount = brokie;
    }

    public double deposit(double funds) {
        double newBalance = brokeBoiAccount + funds;
        return newBalance;
    }

    public double withdrawal(double expense) {
        double lessBalance = highValueAccount - expense;
        return lessBalance;
    }

    public void printAccountSummary(double summary) {
        double balance = summary;
        double balance1 = summary;
        System.out.println("Larry's account balance: " + balance);
        System.out.println("Mary's account balance: " + balance1);
    }
}