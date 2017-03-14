package IgorKupchack.Bank;

public class Cashier extends Employer{
    private int speed;

    public Cashier() {
        super();
        this.speed = -1;
    }

    public Cashier(String name, String surname, int date, int mounth, int year, double salery, int id, int speed) {
        super(name, surname, date, mounth, year, salery, id);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
