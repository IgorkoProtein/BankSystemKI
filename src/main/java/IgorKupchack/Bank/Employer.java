package IgorKupchack.Bank;

import sun.util.calendar.Gregorian;

import java.util.GregorianCalendar;

public class Employer extends Human {
    private static int nextID = 1;
    private double salery;
    private int id;
    private GregorianCalendar employment;

    public Employer() {
        super();
        this.salery = -1;
        setId();
        //employment = new GregorianCalendar();
    }

    public Employer(String name, String surname, double salery, int id, int year, int month, int date) {
        super(name, surname, year, month, date);
        this.salery = salery;
        this.id = id;
    }
    /*
    public Employer(int year, int mount, int day){
        employment = new GregorianCalendar(year, mount, day);
    }
    */

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

    public GregorianCalendar getEmployment() {
        return employment;
    }

    public void setEmployment(GregorianCalendar employment) {
        this.employment = employment;
    }

    public GregorianCalendar getExperience(int year, int mount, int day){
        GregorianCalendar today = new GregorianCalendar();
        employment = new GregorianCalendar(year, mount, day);

       int diffYear = (today.get(today.YEAR) - employment.get(employment.YEAR))*365;
       int diffMount = (today.get(today.MONTH) - employment.get(employment.MONTH))*12;
       int diffDays = (today.get(today.MONTH) - employment.get(employment.MONTH)) + diffMount +diffYear;

       int resultYear = diffDays/360;
       int resultMount = (diffDays%360)/12;
       int resultDays = ((diffDays%360)%12);

       GregorianCalendar result = new GregorianCalendar(resultYear, resultMount, resultDays);
       return result;
    }

    @Override
    public String toString() {
        return "Employer{" +
                super.toString() + "salery=" + salery +
                ", id=" + id +
                '}';
    }
}
