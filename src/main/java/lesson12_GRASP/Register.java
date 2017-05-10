package lesson12_GRASP;

import java.util.ArrayList;

public class Register {

    private static ArrayList<Sale> sales =Sale.createArrayList();
    private static String pathToFile = "src/main/java/lesson12_GRASP/Data/saleList";

    public static void addSale(Sale sale){
        sales.add(sale);
    }
    public static void addSale(){
        Sale sl = Sale.create();
        sl.setItems();

        sales.add(sl);

        Serializator.saveData(pathToFile, sales);

    }

    public static void loadSales(){
        sales = (ArrayList<Sale>) Serializator.loadData(pathToFile);
    }

}
