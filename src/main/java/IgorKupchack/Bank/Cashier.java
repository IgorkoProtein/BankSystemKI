package IgorKupchack.Bank;

public class Cashier extends Employer{
    private int speed;
    private Account account;

    public Cashier() {
        super();
        this.speed = -1;
        Account account = new Account();
    }

    public Cashier(String name, String surname, double salery, int id, int speed, int year, int month, int date) {
        super(name, surname, salery, id, year, month, date);
        this.speed = speed;
        Account account = new Account();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
