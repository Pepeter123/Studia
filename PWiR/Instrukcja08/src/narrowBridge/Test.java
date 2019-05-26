package narrowBridge;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;

public class Test {

    private final static int WEST_QUEUE_SIZE = 10;
    private final static int EAST_QUEUE_SIZE = 10;
    public static Semaphore semaphoreWest = new Semaphore(1);
    public static Semaphore semaphoreEast = new Semaphore(0);

    public static void main(String[] args) throws Exception {

        ArrayBlockingQueue<Integer> westQueue = new ArrayBlockingQueue<>(WEST_QUEUE_SIZE);
        ArrayBlockingQueue<Integer> eastQueue = new ArrayBlockingQueue<>(EAST_QUEUE_SIZE);

        for (int m = 0; m < EAST_QUEUE_SIZE; m++) {
            eastQueue.put(m);
        }

        for (int n = 0; n < WEST_QUEUE_SIZE; n++) {
            westQueue.put(n);
        }

        WestSide[] westArray = new WestSide[WEST_QUEUE_SIZE];
        EastSide[] eastArray = new EastSide[EAST_QUEUE_SIZE];

        Thread[] threads = new Thread[2*WEST_QUEUE_SIZE];


        for (int i = 0, j = EAST_QUEUE_SIZE; i < EAST_QUEUE_SIZE; i++, j++) {
            threads[i] = new Thread(westArray[i]);
            threads[j] = new Thread(eastArray[i]);
        }



    }
}
