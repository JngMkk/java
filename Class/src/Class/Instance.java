package Class;

public class Instance {
    public static void main(String[] args) {
        // 두 개의 인스턴스 생성
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();

        a.deposit(5000);
        b.deposit(3000);

        a.withdraw(2000);
        b.withdraw(2000);

        a.checkMyBalance();
        b.checkMyBalance();
    }
}
