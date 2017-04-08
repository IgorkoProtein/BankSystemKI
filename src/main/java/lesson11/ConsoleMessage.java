package lesson11;

public abstract class ConsoleMessage implements IShow, IPrint{
    public void showMassege(String str) {
        System.out.println(str);
    }

    public void printMessage(String str) {
        System.out.println(str);
    }
}
