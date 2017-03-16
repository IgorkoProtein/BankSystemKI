package IgorKupchack.Bank;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Human {
    private String name;
    private String surname;
    private GregorianCalendar born_date;

    public Human() {
        name = "-1";
        surname = "-1";
        born_date = new GregorianCalendar();
    }

    /**
     * @param name    - імя
     * @param surname - прізвище
     */
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        born_date = new GregorianCalendar();
    }

    /**
     *
     */
    public void setName() {
        String a;
        System.out.println("Enter his name");
        Scanner b = new Scanner(System.in);
        a = b.next();
        name = a;
    }

    /**
     * @param name - даний параметр може бути переданий в метод як String
     */
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


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setBorn_date(GregorianCalendar born_date) {
        this.born_date = born_date;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", born_date=" + born_date.get(born_date.YEAR) +  " " + born_date.get(born_date.MONTH) + " " + born_date.get(born_date.DATE) +
                '}';
    }
}


