package lesson8;

import IgorKupchack.Bank.Employer;

public class lesson_8 {
    public static void main(String[] args) {
        double bonus = 100;
        Employer stas = new Employer("stas", "Stratan", 29000, 12, 1996, 6, 5);
        Employer nazar = new Employer("Nazar", "Stratan", 29000, 12, 1996, 6, 5);

        raiseBonus(bonus);
        raiseBonus(stas);
        System.out.println("Bonus = " + bonus);
        System.out.println("New salary = " + stas.getSalery());

        swap(stas, nazar);
        System.out.println(stas.toString());
        System.out.println(nazar.toString());
    }

    public static void raiseBonus(double x) {
        x = 3 * x;
    }

    public static void raiseBonus(Employer x) {
        x.raiseSalary(300);
    }

    public static void swap(Employer x, Employer y) {
        Employer temp = x;
        x = y;
        y = temp;
    }

}
