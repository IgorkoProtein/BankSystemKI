package IgorKupchack.Bank;

public class Maneger extends Employer {
    private int experience;
    private Account account;


    public Maneger() {
        super();
        this.experience = -1;
        Account account = new Account();
    }

    public Maneger(String name, String surname, double salery, int id, int experience, int year, int month, int date) {
        super(name, surname, salery, id, year, month, date);
        this.experience = experience;
        Account account = new Account();
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void raiseSalary() {
        setSalery(getSalery()+getSalery()*0.20);
    }

    @Override
    public String toString() {
        return "Maneger{" +
                super.toString() +
                "experience=" + experience +
                ", account=" + account +
                '}';
    }
}
