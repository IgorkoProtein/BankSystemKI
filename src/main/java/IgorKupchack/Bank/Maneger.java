package IgorKupchack.Bank;

public class Maneger extends Employer {
    private int experience;
    private Account account;


    public Maneger() {
        super();
        this.experience = -1;
        Account account = new Account();
    }

    public Maneger(String name, String surname, int date, int mounth, int year, double salery, int id, int experience) {
        super(name, surname, salery, id);
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
    public String toString() {
        return "Maneger{" +
                super.toString() +
                "experience=" + experience +
                ", account=" + account +
                '}';
    }
}
