package IgorKupchack.Bank;



public class Account {


    private int accountNumber;
    private double balence;
    private int password;

    public Account() {
        this.accountNumber = 1;
        this.balence = 0.1;
        this.password = 1;
    }

    public Account(int accountNumber, double balence, int password) {
        this.accountNumber = accountNumber;
        this.balence = balence;
        this.password = password;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalence() {
        return balence;
    }

    public int getPassword() {
        return password;
    }

}

