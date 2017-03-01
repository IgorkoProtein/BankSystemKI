package IgorKupchack.Bank.lesson5;

public class Car {
    private String name;
    private CarControll controll = new CarControll();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private Engine engine;

    public Car(String name) {
        this.name = name;
    }

    public void turbo(){
        controll.turbo();
    }

    public void stop(){
        controll.stop();
    }
}
