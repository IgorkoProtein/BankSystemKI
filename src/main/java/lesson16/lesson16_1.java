package lesson16;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class lesson16_1 {
    private static Logger log = Logger.getLogger(lesson16_1.class);

    public static void main(String[] args) {
        subProgram();
    }

    public static void subProgram() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("d = ");
            int d = input.nextInt();
            int value = 50 / d;
            System.out.println("After dividing");
        } catch (ArithmeticException e) {
            log.error("Error in program");
            log.error(e.getMessage());
            log.error(e.getStackTrace());
            //System.out.println("Error in program ");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("After dividing by 0");
    }
}
