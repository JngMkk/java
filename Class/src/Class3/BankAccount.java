package Class3;

public class BankAccount {
    String accNumber;
    String ssNumber;
    int balance;

    // 생성자(init)
    public BankAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔액: " + balance);
        return balance;
    }
}
