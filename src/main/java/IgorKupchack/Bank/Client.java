package IgorKupchack.Bank;


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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
