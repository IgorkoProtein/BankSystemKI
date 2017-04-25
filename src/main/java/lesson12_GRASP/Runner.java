package lesson12_GRASP;

public class Runner {
    public static void main(String[] args) {
        //Product pr1 = new Product();

        ProductCatalog.addProduct("Пиво", 15);
        ProductCatalog.addProduct("Риба", 50);
        ProductCatalog.addProduct("Сир", 15);

        ProductCatalog.showProducts();


        //SalesLineItem slm1 = new SalesLineItem();
        //Sale sl = new Sale();
    }
}
