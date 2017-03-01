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
}


