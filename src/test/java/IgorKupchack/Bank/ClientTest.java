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
        assertEquals("Incorect phone number format", cl.setPhoneNumber(testPhone1));
        assertEquals("Phone number is setup", cl.setPhoneNumber(testPhone2));
    }

    @Test // TODO Task 4002
    public void getMobileOperatorTest() throws Exception {
        Client cl = new Client();
        String testPhone1 = "0971073443";
        String testPhone2 = "0501073443";
        cl.setPhoneNumber(testPhone1);
        assertEquals("Kyivstar", cl.getMobileOperator());
        cl.setPhoneNumber(testPhone2);
        assertEquals("Vodafone", cl.getMobileOperator());
    }

    @Test
    public void accountTest() {
        Client igor = new Client();
        Account ac = new Account("4444555566667777", 5000, 5555);
        igor.setAccount(ac);

    }

    @Test // TODO Task 4003
    public void checkAgeTest() throws Exception {
        Client cl1 = new Client("Nazar", "Mykhailiv",
                30, 07, 1990,
                "0971073443");
        Client cl2 = new Client("Igor", "Kupchack",
                1, 01, 2001,
                "0501073443");

        //assertEquals("It's possible to open account for this client", cl1.checkAge());
        //assertEquals("It's not possible to open account for this client", cl2.checkAge());
    }
}
