package lesson12_GRASP;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Sale {
    private ArrayList<SalesLineItem> items;
    private GregorianCalendar date;

    public Sale() {
        items = new ArrayList<SalesLineItem>();
        date = new GregorianCalendar();
    }

    public void setItems(Product product, int quantity) {
        SalesLineItem salesLineItem = SalesLineItem.create();
        salesLineItem.setProduct(product);
        salesLineItem.setQuantity(quantity);
        items.add(salesLineItem);
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public ArrayList<SalesLineItem> getItems() {
        return items;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public double getSummaryPrice() {
        double temp = 0;
        for (int i = 0; i < items.size(); i++) {
            temp += items.get(i).getSubPrice();
        }
        return temp;
    }

    public void setItems() {
        Scanner input = new Scanner(System.in);
        int condition;

        do {
            Product temp = ProductCatalog.chooseProduct();
            System.out.println("How much product do you want? ");
            System.out.print("quantity: ");
            int quantity = input.nextInt();
            setItems(temp, quantity);

            System.out.println("Do you want to add new item to sale? Yre - 1, no 0");
            do {
                condition = input.nextInt();
                if (condition == 0 || condition == 1) {
                    break;
                } else {
                    System.out.println("Error input!!! TRY AGAIN");
                }
            } while (true);

        } while (condition == 1);
    }

    public static Sale create() {
        return new Sale();
    }

    @Override
    public String toString() {
        return "Sale{" + super.toString() +
                "items=" + items +
                ", date=" + date +
                '}';
    }
}
