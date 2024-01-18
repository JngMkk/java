package Class3;

public class Constructor {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("12-34-56", "000000-0000000", 10000);
        BankAccount b = new BankAccount("34-56-78", "000000-0000000", 20000);

        a.deposit(5000);
        b.deposit(2000);
        a.withdraw(2000);
        b.withdraw(3000);
        a.checkMyBalance();
        b.checkMyBalance();
    }
}
