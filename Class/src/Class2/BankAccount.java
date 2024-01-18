package Class2;

public class BankAccount {
    String accNumber;       // 계좌번호
    String ssNumber;        // 주민번호
    int balance = 0;        // 예금 잔액

    public void initAccount(String acc, String ss, int bal) {
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
