package narrowBridge;

import java.util.concurrent.ArrayBlockingQueue;

public class WestSide implements Runnable {

    private ArrayBlockingQueue<Integer> WestCarQueue ;

    WestSide(ArrayBlockingQueue<Integer> westQueue) {
        WestCarQueue = westQueue;
    }

    @Override
    public void run() {
        while (true)
        {
            try {
                Integer a = WestCarQueue.take();
                System.out.println(Thread.currentThread().getName() + " / " + a + " went through the bridge");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
