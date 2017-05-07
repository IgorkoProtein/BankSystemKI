package lesson12_GRASP.Menu;

import java.util.Scanner;

public class BuyerMenu {
    private static int choose = -1;

    public static void run() {
        do {
            showMenu();
            choose = getMenuNumber();
            doAction(choose);
        }while(choose != 0);
    }

    public static void showMenu(){
        System.out.println("\n\n");
        System.out.println("1 - choose Product");
        System.out.println("2 - buyer's menu");
        System.out.println("0 - Exit enter");
    }

    public static int getMenuNumber(){
        Scanner input = new Scanner(System.in);
        int temp = -1;

        do {
            System.out.print("Enter menu's number : ");

            temp = input.nextInt();
        }while (temp<0 || temp>3);

        return temp;
    }

    public static void doAction(int a){
        switch (a) {
            case 1: SellerMenu.run();
                //case 2: buterMenu();
            case 0: System.exit(0);
        }
    }

}
