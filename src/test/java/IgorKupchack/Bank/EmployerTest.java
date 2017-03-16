package IgorKupchack.Bank;

import org.junit.Test;

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
    public void toStringTest() throws Exception {
        Employer ivan = new Employer();
        System.out.printf(ivan.toString());
    }

}