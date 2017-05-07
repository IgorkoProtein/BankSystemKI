package lesson12_GRASP.Menu;

import lesson12_GRASP.ProductCatalog;

import java.util.Scanner;

public class SellerMenu {
    private static int choose = -1;

    public static void run() {
        do {

            showMenu();
            choose = getMenuNumber();
            doAction(choose);
        } while (choose != 0);
    }

    public static void showMenu() {
        System.out.println("\n\n");
        System.out.println("1 - Add new product");
        System.out.println("2 - Show product ");
        System.out.println("0 - Exit enter");
    }

    public static int getMenuNumber() {
        Scanner input = new Scanner(System.in);
        int temp = -1;

        do {
            System.out.print("Enter menu's number : ");

            temp = input.nextInt();
        } while (temp < 0 || temp > 3);

        return temp;
    }

    public static void doAction(int a) {
        switch (a) {
            case 1:
                ProductCatalog.addProduct();
                break;
            case 2:
                ProductCatalog.showProducts();
                break;
            case 0:
                choose = 0;
                break;

        }
    }
}
