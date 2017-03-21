package IgorKupchack.Bank;


public class Client extends Human {
    private String phoneNumber;
    private Account account;
    private static int ID = 10;
    private int clientID;

    public Client() {
        super();
        phoneNumber = "-1";
        account = new Account();
        setID();
    }



    public Client(String name, String surname, String phoneNumber, int year, int month, int date) {
        super(name, surname, year, month, date);
        this.phoneNumber = phoneNumber;
        account = new Account();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        String setupMessage = "Phone number is setup";
        String wrongMessage = "Incorect phone number format";
        int size = phoneNumber.length();
        if (size == 10) {
            return wrongMessage;
        } else {
            return setupMessage;
        }
    }

    public String getMobileOperator() {
        String[] operators = new String[]{"Kyivstar", "Vodafone"};
        String[] operCode = new String[]{"097", "050"};
        StringBuilder tempStr = new StringBuilder(this.phoneNumber);
        String code;
        int i;

        code = tempStr.substring(0, 3);

        for (i = 0; i < operCode.length; i++) {
            if (code.compareTo(operCode[i]) == 0) {
                break;
            }
        }
        if (i == operators.length) {
            return "none";
        } else {
            return operators[i];
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public void setID(){
        clientID = ID;
        ID++;
    }

    @Override
    public String toString() {
        return "Client{  " + super.toString() +
                "phoneNumber='" + phoneNumber + '\'' +
                ", account=" + account +
                '}';
    }
}


