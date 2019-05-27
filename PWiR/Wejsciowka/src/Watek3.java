import java.util.concurrent.ArrayBlockingQueue;

public class Watek3 extends Thread {

    private ArrayBlockingQueue<Integer> kolejka2;

    Watek3(ArrayBlockingQueue<Integer> kolejka_2) {
        kolejka2 = kolejka_2;
    }

    @Override
    public void run() {
        while (true) {
            try {

                Integer y = kolejka2.take();

                System.out.println(Thread.currentThread().getName() + " pobral policzone: " + y);

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}