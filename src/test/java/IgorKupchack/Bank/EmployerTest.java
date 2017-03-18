package IgorKupchack.Bank;

import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class EmployerTest {
    @Test
    public void saleryTest() throws Exception {
        Employer vova = new Employer();
        double testSalery = 2024.3;
        vova.setSalery(testSalery);
        assertEquals(testSalery, vova.getSalery(), 0);
    }

    @Test
    public void getAgeTest() throws Exception {
        Employer stas = new Employer("stas", "Stratan", 29000, 12);
        GregorianCalendar date = new GregorianCalendar(1996, 06, 05);
        stas.setBorn_date(date);

        stas.getAge(date);
    }

    @Test
    public void toStringTest() throws Exception {
        Employer ivan = new Employer();
        System.out.printf(ivan.toString());
    }

}