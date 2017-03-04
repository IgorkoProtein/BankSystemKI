package IgorKupchack.Bank;

import org.junit.Test;

public class AccountTest {
    @Test
    public void accountTest(){
        Account igor = new Account(45, 100.45,12345678);

        System.out.println(igor.getAccountNumber()+" "+igor.getPassword()+" "+igor.getBalence());

        igor.setAccountNumber(1);
        igor.setPassword(777);
        igor.setBalence(0.0);

        System.out.println(igor.getAccountNumber()+" "+igor.getPassword()+" "+igor.getBalence());

    }

}
