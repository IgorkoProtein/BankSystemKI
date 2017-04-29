package lesson12_GRASP;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductCatalog {
    private static ArrayList<Product> products = new ArrayList<Product>();

    public static void addProduct(String name, double price) {
        products.add(new Product(name, price));
    }

    public static void showProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static Product chooseProduct() {
        showProducts();
        Scanner temp = new Scanner(System.in);
        System.out.print("Choose product by index: ");
        int inputIndex = temp.nextInt();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getItemID() == inputIndex) {
                inputIndex = i;
                break;
            }
        }
        return products.get(inputIndex);
    }

    public static void addProduct() {
        int condition = 1;
        String productName;
        double productPrice;

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Please, enter name of product: ");
            productName = input.nextLine();

            System.out.println("Please, enter price of product: ");
            productPrice = input.nextDouble();

            addProduct(productName, productPrice);
            System.out.println("Do you want to create new object? Yes - enter 1, No - enter 0");
            condition = input.nextInt();
        } while (condition == 1);
    }
}
