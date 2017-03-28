package IgorKupchack.Bank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class EmployerTest {
    @Test
    public void getExperience() throws Exception {
        Employer vovka = new Employer();

        GregorianCalendar date = new GregorianCalendar(2015, 4, 23);
        vovka.setEmployment(date);

        assertEquals(1, vovka.getExperience(), 0);
        //System.out.println(vovka.getExperience());
    }


    @Test
    public void saleryTest() throws Exception {
        Employer vova = new Employer();
        double testSalery = 2024.3;
        vova.setSalery(testSalery);
        assertEquals(testSalery, vova.getSalery(), 0);
    }

    @Test
    public void toStringTest() throws Exception {
        Employer ivan = new Employer();
        System.out.printf(ivan.toString());
    }

    @Test
    public void getAgeTest() throws Exception {
        Employer stas = new Employer("stas", "Stratan", 29000, 12, 1996, 6, 5);
        assertEquals(20, stas.getAge(), 0);

    }

    @Test
    public void getNextID() throws Exception {
        ArrayList<Employer> staff = new ArrayList<Employer>();
        staff.add(new Employer());
        staff.add(new Employer());
        staff.add(new Employer());
        staff.add(new Employer());

        for (Employer human : staff) {
            System.out.println(human.toString());
        }

        System.out.println(Employer.getNextID());

    }

    @Test
    public void polimorfizmTest() throws Exception {
        ArrayList<Employer> staff = new ArrayList<Employer>();
        staff.add(new Employer());
        staff.add(new Maneger());
        staff.add(new Maneger());
        staff.add(new Employer());

        for (Employer human : staff) {
            human.raiseSalary();
            System.out.println(human.toString());
        }

        Employer em = new Employer();
        Employer em2 = new Maneger();

    }

    @Test
    public void groupIdTest(){
        ArrayList<Employer> temp = new ArrayList<Employer>();
        temp.add(new Employer());
        temp.add(new Employer());
        temp.add(new Maneger());
        temp.add(new Employer());

        for (Employer i : temp) {
            i.groupId();
            System.out.println(i.toString());
        }

    }
}