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
}
