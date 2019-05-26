package narrowBridge;

import narrowBridge.bridge.Bridge;

import java.util.concurrent.ArrayBlockingQueue;

public class EastSide implements Runnable {
    public ArrayBlockingQueue<Integer> EastCarQueue;

    public EastSide(ArrayBlockingQueue<Integer> eastQueue) {
        EastCarQueue = eastQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Bridge.semaphoreEast.acquire();
                Integer a = EastCarQueue.take();
                System.out.println(Thread.currentThread().getName() + " / " + a + " went through the bridge");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Bridge.semaphoreWest.release();

        }
    }
}