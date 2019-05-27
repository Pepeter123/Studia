import java.util.concurrent.ArrayBlockingQueue;

public class Watek2 extends Thread {

    private ArrayBlockingQueue<Integer> kolejka1;
    private ArrayBlockingQueue<Integer> kolejka2;

    Watek2(ArrayBlockingQueue<Integer> kolejka_1, ArrayBlockingQueue<Integer> kolejka_2) {
        kolejka1 = kolejka_1;
        kolejka2 = kolejka_2;
    }

    @Override
    public void run() {
        while (true) {
            try {

                    Integer x1 = kolejka1.take();
                    Integer x2 = kolejka1.take();

                    int y = x1 * x1 + x2 * x2;


                    kolejka2.put(y);

                System.out.println(Thread.currentThread().getName() + " bierze " + x1 +" bierze " + x2);

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}