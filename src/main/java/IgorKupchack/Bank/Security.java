package IgorKupchack.Bank;

public class Security extends Employer{
    private double height;


    public Security() {
        super();
        this.height = -1.1;
    }

    public Security(String name, String surname, int date, int mounth, int year, double salery, int id, double height) {
        super(name, surname, date, mounth, year, salery, id);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
