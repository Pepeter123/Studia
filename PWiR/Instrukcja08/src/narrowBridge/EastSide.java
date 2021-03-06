package narrowBridge;

import narrowBridge.bridge.Bridge;

import java.util.concurrent.ArrayBlockingQueue;

public class EastSide implements Runnable {

    private ArrayBlockingQueue<Integer> EastCarQueue;

    public EastSide(ArrayBlockingQueue<Integer> eastQueue) {
        EastCarQueue = eastQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer a = EastCarQueue.take();
                System.out.println(Thread.currentThread().getName() + " / " + a + " went through the bridge");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}