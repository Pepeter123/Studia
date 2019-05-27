import java.util.concurrent.ArrayBlockingQueue;

public class Watek2 extends Thread {

    private ArrayBlockingQueue<Integer> kolejka1;
    private ArrayBlockingQueue<Integer> kolejka2;

    public Watek2(ArrayBlockingQueue<Integer> kolejka_1, ArrayBlockingQueue kolejka_2) {
        kolejka1 = kolejka_1;
        kolejka2 = kolejka_2;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < kolejka1.size(); i++) {


                Integer x1 = kolejka1.take();
                Integer x2 = kolejka1.take();

                int y = x1 * x1 + x2 * x2;

                kolejka2.put(y);
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
