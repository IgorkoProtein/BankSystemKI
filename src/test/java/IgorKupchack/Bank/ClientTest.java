package IgorKupchack.Bank;


import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void inheritanceTest() throws Exception {
        Client cl = new Client();
        String testName = "Nazar";
        cl.setName(testName);
        assertEquals(testName, cl.getName());
    }

    @Test // TODO Task 4001
    public void phoneNumberTest() throws Exception {
        Client cl = new Client();
        String testPhone1 = "0971073443";
        String testPhone2 = "380971073443";
        assertEquals("Incorect phone number format", cl.setPhone(testPhone1));
        assertEquals("Phone number is setup", cl.setPhone(testPhone2));
    }
}
