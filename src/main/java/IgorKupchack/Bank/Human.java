package IgorKupchack.Bank;

import java.util.Scanner;

public class Human {
    private String name;
    private String surname;
    private int date;
    private int mounth;
    private int year;

    public Human() {
        name = "-1";
        surname = "-1";
        date = mounth = year = -1;
    }

    public Human(String name, String surname, int date, int mounth, int year) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.mounth = mounth;
        this.year = year;
    }

    public void setName() {
        String a;
        System.out.println("Enter his name");
        Scanner b = new Scanner(System.in);
        a = b.next();
        name = a;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSurName() {
        String c;
        System.out.println("Enter his surname");
        Scanner b = new Scanner(System.in);
        c = b.next();
        surname = c;
    }

    public void setDate() {
        int d;
        System.out.println("Enter his date of birth(day)");
        Scanner b = new Scanner(System.in);
        d = b.nextInt();
        date = d;
    }

    public void setMounth() {
        int e;
        System.out.println("Enter his date of birth(mount)");
        Scanner b = new Scanner(System.in);
        e = b.nextInt();
        mounth = e;
    }

    public void setYear() {
        int d;
        System.out.println("Enter his date of birth(year)");
        Scanner b = new Scanner(System.in);
        d = b.nextInt();
        year = d;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + " " + surname + ", he was born at " + date + "." + mounth + "." + year);
    }

}
