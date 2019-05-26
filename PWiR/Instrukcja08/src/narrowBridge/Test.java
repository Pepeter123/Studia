package narrowBridge;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {

    private final s1tatic int  WEST_QUEUE_SIZE = 10;
    private final static int  EAST_QUEUE_SIZE = 10;

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

        Thread[] threadsWest = new Thread[WEST_QUEUE_SIZE];
        Thread[] threadsEast = new Thread[EAST_QUEUE_SIZE];



        for (int i = 0; i < EAST_QUEUE_SIZE; i++) {
            threadsEast[i] = new Thread(westArray[i]);
            threadsEast[i].start();
        }

        for (int j = 0; j < WEST_QUEUE_SIZE; j++) {
            threadsWest[j] = new Thread(eastArray[j]);
            threadsWest[j].start();
        }

    }
}
