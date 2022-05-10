public class Mane {
    public static void main(String[] args) throws Exception {
        BankTransfer bankTransfer = new BankTransfer(5000.0, 300.0);

        System.out.println("Good evening Larry, Mary.  Larry, your balance is: " + bankTransfer.highValueAccount);
        System.out.println("Mary, your balance is: " + bankTransfer.brokeBoiAccount);
        System.out.println("Shall we commence a transfer?  Process initiated.");

        double moneyReaction = bankTransfer.withdrawal(100.0);
        double moneyCreation = bankTransfer.deposit(100.0);

        System.out.println("Larry's account balance: $" + moneyReaction);
        System.out.println("Mary's account balance: $" + moneyCreation);
    }
}