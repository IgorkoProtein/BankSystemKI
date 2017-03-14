package IgorKupchack.Bank;

public class Maneger extends Employer {
    private int experience;


    public Maneger() {
        super();
        this.experience = -1;
    }

    public Maneger(String name, String surname, int date, int mounth, int year, double salery, int id, int experience) {
        super(name, surname, date, mounth, year, salery, id);
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
