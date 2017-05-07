package lesson12_GRASP;

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
        System.out.printf("seller's menu");
        System.out.printf("buyer's menu");
        System.out.printf("Exit enter 0");
    }

    public static int getMenuNumber(){
        Scanner input = new Scanner(System.in);
        int temp = -1;

        do {
            System.out.println("Enter menu's number");

            temp = input.nextInt();
        }while (temp<0 || temp>3);

        return temp;
    }

    public static void doAction(int a){
        switch (a) {
            case 1: SellerMenu.main();
            //case 2: buterMenu();
            case 0: System.exit(0);
        }
    }

}
