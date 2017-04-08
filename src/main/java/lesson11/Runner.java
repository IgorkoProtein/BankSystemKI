package lesson11;

public class Runner {
    public static void main(String[] args) {
        ConsoleDialogMessage ms = new ConsoleDialogMessage();
        IShow message = new ConsoleDialogMessage();
        IShow newfileMessage = new FileMessage();
        //IShow printMessage = new PrinterMessage();
        IPrint fileMessage = new ConsoleDialogMessage();


        message.showMassege("пивасик");
    }
}
