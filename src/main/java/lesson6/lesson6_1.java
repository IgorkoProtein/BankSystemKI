package lesson6;

import IgorKupchack.Bank.Employer;

import java.util.ArrayList;

public class lesson6_1 {
    public static void main(String[] args) {
        double x = 31.5;
        int y = (int) x;
        System.out.println("y = " + y);


        ArrayList<Employer> staff = new ArrayList<Employer>();
        staff.add(new Employer());
        staff.add(new Employer());
        staff.add(new Employer("Nazar", "Mykhailiv",2000,1));
        staff.add(new Employer());

        System.out.println("Size of arrayList " + staff.size());

        Employer em1 = staff.get(2);

        staff.remove(1);

        System.out.println(staff.indexOf(em1));


        System.out.println(staff.get(0).toString());


    }
}
