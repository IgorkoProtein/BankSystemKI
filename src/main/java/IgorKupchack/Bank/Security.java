package IgorKupchack.Bank;

public class Security extends Employer{
    private double height;
    private Account account;


    public Security() {
        super();
        this.height = -1.1;
        Account account = new Account();
    }

    public Security(String name, String surname, int date, int mounth, int year, double salery, int id, double height) {
        super(name, surname, date, mounth, year, salery, id);
        this.height = height;
        Account account = new Account();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

