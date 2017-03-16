package IgorKupchack.Bank;

import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class HumanTest {
    @Test
    public void setNameTest() throws Exception {
        Human hm = new Human();
        String testName = "Nazar";
        hm.setName(testName);
        assertEquals(testName, hm.getName());
    }

    @Test
    public void constructorTest() throws Exception {
        Human hm = new Human();
        assertEquals("1", hm.getName());
    }


    @Test
    public void callendarTest() throws Exception {
        Human igorko = new Human("Igor", "Kupchack");
        GregorianCalendar date = new GregorianCalendar(1997, 04, 25);
        igorko.setBorn_date(date);
        System.out.printf(igorko.toString());
    }
}