package IgorKupchack.Bank;

import java.util.Scanner;

public class Human {
    private String name;
    private String surname;
    private int date;
    private int mounth;
    private int year;

    public Human() {
        name = "";
        surname = "";
        date = mounth = year = 0;
    }

    public void setName() {
        String a;
        System.out.println("Enter his name");
        Scanner b = new Scanner(System.in);
        a = b.next();
        name = a;
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

    public void show() {
        System.out.println(name + " " + surname + ", he was born at " + date + "." + mounth + "." + year);
    }

}
