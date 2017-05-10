package lesson12_GRASP.Menu;

import lesson12_GRASP.ProductCatalog;
import lesson12_GRASP.Serializator;

import java.util.Scanner;

public class Menu {
    private static int choose = -1;

    public static void main(String[] args) {
        do {
            //ProductCatalog.loadProduct();
            showMenu();
            choose = getMenuNumber();
            doAction(choose);
        } while (choose != 0);
    }

    public static void showMenu() {

        System.out.println("1 - Seller's menu");
        System.out.println("2 - Buyer's menu");
        System.out.println("0 - Exit enter");
    }

    public static int getMenuNumber() {
        Scanner input = new Scanner(System.in);
        int temp = -1;

        do {
            System.out.print("Enter menu's number : ");

            temp = input.nextInt();
        } while (temp < 0 || temp > 2);

        return temp;
    }

    public static void doAction(int choise) {
        switch (choise) {
            case 1:
                SellerMenu.run();
                break;
            case 2:
                BuyerMenu.run();
                break;
            case 0:
                System.exit(0);
        }
    }

}
