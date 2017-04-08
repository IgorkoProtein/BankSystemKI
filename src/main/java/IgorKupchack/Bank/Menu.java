package IgorKupchack.Bank;

import java.util.Scanner;

public class Menu {
    private static int choose = -1;

    public static void main(String[] args) {
        do {
            showMenu();
            choose = getMenuNumber();
            doAction(choose);
        }while(choose != 0);
    }

    public static void showMenu(){
        System.out.println("1 - first menu");
        System.out.println("2 - second menu");
        System.out.println("3 - third menu");
        System.out.println("0 - exit");
    }

    public static int getMenuNumber(){

        Scanner imput = new Scanner(System.in);

        int temp = -1;
        do {
            System.out.print("Enter menu number: ");
            //temp = imput.next();
        }while(temp<0 || temp>3);

        return temp;
    }

    public static void doAction(int a) {
        switch (a) {
            case 1: System.out.println("calling - first menu"); break;
            case 2: System.out.println("calling - second menu"); break;
            case 3: System.out.println("calling - third menu"); break;
            case 0: System.exit(0);
        }
    }
}
