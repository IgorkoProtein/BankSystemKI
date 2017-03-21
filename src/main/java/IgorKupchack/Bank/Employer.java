package IgorKupchack.Bank;

import sun.util.calendar.Gregorian;

import java.util.GregorianCalendar;

public class Employer extends Human {
    private static int nextID = 1;
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
        id = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public void raiseSalary(int raiseTo) {
        salery = salery + raiseTo;
    }

    public void raiseSalary() {
        salery += salery*0.10;
    }

    public GregorianCalendar getEmployment() {
        return employment;
    }

    public void setEmployment(GregorianCalendar employment) {
        this.employment = employment;
    }

    public int getExperience(){
        GregorianCalendar today = new GregorianCalendar();

       int diffYear = (today.get(today.YEAR) - employment.get(employment.YEAR))*365;
       int diffMount = (today.get(today.MONTH) - employment.get(employment.MONTH))*12;
       int diffDays = (today.get(today.MONTH) - employment.get(employment.MONTH)) + diffMount +diffYear;

       int resultYear = diffDays/360;
       int resultMount = (diffDays%360)/12;
       int resultDays = ((diffDays%360)%12);

       GregorianCalendar result = new GregorianCalendar(resultYear, resultMount, resultDays);
       return 0;
    }

    @Override
    public String toString() {
        return "Employer{" +
                super.toString() + "salery=" + salery +
                ", id=" + id +
                '}';
    }
}
