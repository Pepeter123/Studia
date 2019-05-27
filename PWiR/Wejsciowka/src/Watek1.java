import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Watek1 extends Thread {

    private ArrayBlockingQueue<Integer> kolejka1;

    public Watek1(ArrayBlockingQueue<Integer> kolejka) {
        kolejka1 = kolejka;
    }


    Random rand = new Random();


    @Override
    public void run() {
        try {

            for (int i = 0; i < kolejka1.size(); i++) {

                kolejka1.put(rand.nextInt(10));
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " wystartował.");
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }
}
