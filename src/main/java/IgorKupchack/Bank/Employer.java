package IgorKupchack.Bank;

import java.util.GregorianCalendar;

public class Employer extends Human {
    private static int nextIDem = 1;

    private double salery;
    private int id;
    private GregorianCalendar employment = null;

    public Employer() {
        super();
        this.salery = 3000;
        setId();
        employment = new GregorianCalendar();
    }

    public Employer(String name, String surname, double salery, int id, int year, int month, int date) {
        super(name, surname, year, month, date);
        this.salery = salery;
        this.id = id;
        employment = new GregorianCalendar();
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        id = nextIDem;
        groupId();
        nextIDem++;
    }

    public static int getNextIDem() {
        return nextIDem;
    }

    public void raiseSalary(int raiseTo) {
        salery = salery + raiseTo;
    }

    public void raiseSalary() {
        salery += salery * 0.10;
    }

    public GregorianCalendar getEmployment() {
        return employment;
    }

    public void setEmployment(GregorianCalendar employment) {
        this.employment = employment;
    }

    public int getExperience() {
        GregorianCalendar today = new GregorianCalendar();

        int diffYear = (today.get(today.YEAR) - employment.get(employment.YEAR));
        int diffMount = diffYear * 12 + (today.get(today.MONTH) - employment.get(employment.MONTH));

        return diffMount / 12;
    }

    public void groupId() {
        id += 2000;
    }

    @Override
    public String toString() {
        return "Employer{" +
                super.toString() + "salery=" + salery +
                ", id=" + id +
                '}';
    }
}
