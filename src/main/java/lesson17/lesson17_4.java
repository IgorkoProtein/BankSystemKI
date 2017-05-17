package lesson17;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson17_4 {

    private static Logger log = Logger.getLogger(lesson17_3.class);

    public static void main(String[] args) {
        try {
            System.out.println(setYear());
        } catch (InputMismatchException e) {
            log.error("Неправельний формат введення дати народження" + e.toString());
            System.out.println("Неправельний формат введення дати");
            setYear();
        }
    }

    public static String setYear() throws InputMismatchException {
        String date = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your date of birtsday (YYYY-MM-DD) :");
        date = input.next();

        for (int i = 0; i < date.length(); i++) {
            if (i <= 3 || (i >= 5 && i <= 6) || (i >= 8 && i <= 9)) {
                if (date.charAt(i) < 48 || date.charAt(i) > 57) {
                    date = "2017-05-17";
                    throw new InputMismatchException();
                }
            }
            if (i == 4 || i == 7) {
                if (!(date.charAt(i) == '-')) {
                    date = "2017-05-17";
                    throw new InputMismatchException();
                }
            }
        }

        return date;
    }
}
