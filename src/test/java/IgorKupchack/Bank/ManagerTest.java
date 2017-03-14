package IgorKupchack.Bank;

import org.junit.Test;
import static org.junit.Assert.*;  // ??????????

public class ManagerTest {
    @Test
    public void managerTest()
    {
        Maneger vasul = new Maneger("Vasul", "Rubchunskiy", 12, 01, 1975, 2100.4, 12321, 23);
        Account aa = new Account( "2222333344445555", 1223.3, 777 );

        vasul.setAccount(aa);

        System.out.printf(vasul.toString());
    }
}
