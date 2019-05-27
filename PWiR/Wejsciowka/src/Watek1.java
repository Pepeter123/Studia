import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Watek1 extends Thread {

    private ArrayBlockingQueue<Integer> kolejka1;

    Watek1(ArrayBlockingQueue<Integer> kolejka) {
        kolejka1 = kolejka;
    }


    private Random rand = new Random();


    @Override
    public void run() {
        while (true) {
            try {
                int i = rand.nextInt(9);
                kolejka1.put(i);
                System.out.println(Thread.currentThread().getName() + " daje " + i);

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}