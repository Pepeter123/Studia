package exercise01.confectioner;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Confectioner implements Runnable {
    private ArrayBlockingQueue<Integer> conveyorBelt;
    private Random random = new Random();

    public Confectioner(ArrayBlockingQueue<Integer> a_queue) {
        conveyorBelt = a_queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int i = random.nextInt(100);
                conveyorBelt.put(i);
                System.out.println(Thread.currentThread().getName() + " produced wafer " + i);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
