package lesson12_GRASP;

import java.io.Serializable;
import java.util.Scanner;

public class SalesLineItem implements Serializable{
    private Product product = null;
    private int quantity;
    private static final long serialVersionUID = 3L;

    public SalesLineItem() {
        product = Product.create();
        quantity = 0;
    }

    public SalesLineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubPrice() {
        return quantity * product.getPrice();
    }



    public static SalesLineItem create() {
        return new SalesLineItem();
    }

    @Override
    public String toString() {
        return "SalesLineItem{" +
                "product=" + product.toString() +
                ", quantity=" + quantity +
                '}';
    }
}
