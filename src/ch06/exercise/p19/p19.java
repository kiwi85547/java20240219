package ch06.exercise.p19;

public class p19 {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println(account.getBalance());

        account.setBalance(-10);
        System.out.println(account.getBalance());

        account.setBalance(2000000);
        System.out.println(account.getBalance());

        account.setBalance(30000);
        System.out.println(account.getBalance());
    }
}

class Account {
    private int balance;

    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }
}


