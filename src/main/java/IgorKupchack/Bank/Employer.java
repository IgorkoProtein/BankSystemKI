package IgorKupchack.Bank;

import sun.util.calendar.Gregorian;

import java.util.GregorianCalendar;

public class Employer extends Human {
    private static int nextID = 1;

    private double salery;
    private int id;

    public Employer() {
        super();
        this.salery = -1;
        setId();
    }

    public Employer(String name, String surname, double salery, int id, int year, int month, int date) {
        super(name, surname, year, month, date);
        this.salery = salery;
        this.id = id;
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
        id = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public void raiseSalary(int raiseTo) {
        salery = salery + raiseTo;
    }

    @Override
    public String toString() {
        return "Employer{" +
                super.toString() + "salery=" + salery +
                ", id=" + id +
                '}';
    }
}
