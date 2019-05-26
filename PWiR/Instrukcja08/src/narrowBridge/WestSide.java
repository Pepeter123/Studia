package narrowBridge;

import narrowBridge.bridge.Bridge;

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
                Bridge.semaphoreWest.acquire();
                Integer a = WestCarQueue.take();
                System.out.println(Thread.currentThread().getName() + " / " + a + " went through the bridge");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Bridge.semaphoreEast.release();

        }
    }
}
