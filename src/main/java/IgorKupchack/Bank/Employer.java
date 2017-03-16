package IgorKupchack.Bank;

public class Employer extends Human {
    private double salery;
    private int id;

    public Employer() {
        super();
        this.salery = -1;
        this.id = -1;
    }

    public Employer(String name, String surname, double salery, int id) {
        super(name, surname);
        this.salery = salery;
        this.id = id;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employer{" +
                super.toString() +                "salery=" + salery +
                ", id=" + id +
                '}';
    }
}
