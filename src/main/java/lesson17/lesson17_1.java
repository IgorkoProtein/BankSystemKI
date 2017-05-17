package lesson17;

import org.apache.log4j.Logger;

import java.util.Random;

public class lesson17_1 {
    private static Logger log = Logger.getLogger(lesson17_1.class);

    public static void main(String[] args) {
        Random random = new Random();
        int a = 0, b = 0, c = 0;
        int counter = 0;
        double someArray[] = new double[100];

        for (int i = 0; i < 500; i++) {
            try {
                b = random.nextInt(100);
                c = random.nextInt(100);
                a = 100500 / (b / c);
                someArray[i] = a;
            } catch (ArithmeticException e) {
                log.error("Ділення на 0" + e.toString());
                a = 0;
                counter++;
            } catch (ArrayIndexOutOfBoundsException e) {
                log.error("Вихід за межі масиву " + e.toString());
            } catch (Exception e) {
                log.error("Інший вид помилки " + e.toString());
                log.error(e.getStackTrace());
            }
            System.out.println("a = " + a);
        }
        log.info("Counter = " + counter);
    }
}
