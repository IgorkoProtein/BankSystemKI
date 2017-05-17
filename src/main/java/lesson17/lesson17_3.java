package lesson17;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson17_3 {
    private static Logger log = Logger.getLogger(lesson17_3.class);
    public static void main(String[] args) {
        System.out.println(setYear());
    }

    public static int setYear(){
        int date = 0;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your date of birtsday :");
            date = input.nextInt();
            System.out.println(date);
        } catch (InputMismatchException e) {
            log.error("Неправельний формат введення дати народження" + e.toString());
            date = 2017;
            System.out.println("Неправельний формат введення дати");
            //setYear();
        }
        return date;
    }
}
