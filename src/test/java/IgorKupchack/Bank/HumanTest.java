package IgorKupchack.Bank;

import org.junit.Test;
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
}