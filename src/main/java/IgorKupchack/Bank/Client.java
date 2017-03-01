package IgorKupchack.Bank;
import java.io.*;


public class Client extends Human {
    private String phoneNumber;

    public Client() {
        super();
        phoneNumber = "-1";
    }

    public Client(String name, String surname, int date, int mounth, int year, String phoneNumber) {
        super(name, surname, date, mounth, year);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        String a = "Phone number is setup";
        String b = "Incorect phone number format";
        int size = phoneNumber.length();
        if (size == 10){
            return a;
        }
        else {
            return b;
        }
    }

}
