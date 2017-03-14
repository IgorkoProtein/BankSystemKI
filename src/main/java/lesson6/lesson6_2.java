package lesson6;

import IgorKupchack.Bank.Cashier;
import IgorKupchack.Bank.Employer;
import IgorKupchack.Bank.Maneger;

import java.util.ArrayList;
import java.util.Date;

public class lesson6_2 {
    public static void main(String[] args) {
        ArrayList<Employer> staff = new ArrayList<Employer>();

        staff.add(new Employer());
        staff.add(new Maneger());
        staff.add(new Cashier());
        staff.add(new Cashier());
        staff.add(new Maneger());

        //staff.get(1).get

        Maneger someBoss = (Maneger) staff.get(1);
        //Date someBoss = (Maneger) staff.get(1);
        someBoss.getExperience();

        //Maneger someBoss2 = (Maneger) staff.get(0);

        callManagers(staff);

    }


    public static void callManagers(ArrayList<Employer> employers) {
        for (Employer human : employers) {
            if (human instanceof Maneger) {
                System.out.println("Call to conference " + employers.indexOf(human) + human.toString());
            }
        }
    }
}
