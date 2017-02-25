package IgorKupchack.Bank;


import org.junit.Test;
import static org.junit.Assert.*;

public class ClientTest {
    @Test //TODO Task 5001
    public void inheritanceTest()throws Exception{
        Client cl = new Client();
        String testName = "Nazar";
        cl.setName(testName);
        assertEquals(testName, cl.getName());
    }
}
