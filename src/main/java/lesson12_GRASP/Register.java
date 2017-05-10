package lesson12_GRASP;

import java.util.ArrayList;

public class Register {

    private static ArrayList<Sale> sales = new ArrayList<Sale>();

    public static void addSale(Sale sale){
        sales.add(sale);
    }
    public static void addSale(){
        Sale sl = Sale.create();
        sl.setItems();


    }

}
