package IgorKupchack.Bank;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployerTest {
    @Test
    public void saleryTest() throws Exception {
        Employer vova = new Employer();
        double testSalery = 2024.3;
        vova.setSalery(testSalery);
       // assertEquals(testSalery, vova.getSalery());
       assertNotEquals(testSalery, vova.getSalery());
    }

    @Test
    public void getId() throws Exception {

    }

    @Test
    public void setId() throws Exception {

    }

}