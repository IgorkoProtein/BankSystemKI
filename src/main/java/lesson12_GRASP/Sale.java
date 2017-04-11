package lesson12_GRASP;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Sale {
    private ArrayList<SalesLineItem> items;
    private GregorianCalendar date;

    public Sale() {
        items = new ArrayList<SalesLineItem>();
        date = new GregorianCalendar();
    }

    public void setItems(Product product, int quantity) {
        items.add(new SalesLineItem(product, quantity));
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

    @Override
    public String toString() {
        return "Sale{" + super.toString() +
                "items=" + items +
                ", date=" + date +
                '}';
    }
}
