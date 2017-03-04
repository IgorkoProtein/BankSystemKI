package IgorKupchack.Bank;


public class Account {
    private String accountNumber;
    private double balance;
    private int password;

    public Account() {
        this.accountNumber = "none";
        this.balance = -1;
        this.password = -1;
    }

    public Account(String accountNumber, double balance, int password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}

