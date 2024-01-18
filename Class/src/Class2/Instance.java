package Class2;

public class Instance {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();

        a.initAccount("12-34-89", "990990-9090990", 10000);
        b.initAccount("33-55-09", "770077-7700077", 20000);

        a.deposit(1000);
        b.deposit(2000);
        a.withdraw(1000);
        b.withdraw(2000);
        a.checkMyBalance();
        b.checkMyBalance();
    }
}
