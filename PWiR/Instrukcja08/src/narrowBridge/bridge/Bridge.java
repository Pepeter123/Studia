package narrowBridge.bridge;

import java.nio.channels.FileLock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;

public class Bridge {
    public ArrayBlockingQueue carQueue = new ArrayBlockingQueue(10);

    public static Semaphore semaphoreWest = new Semaphore(1);
    public static Semaphore semaphoreEast = new Semaphore(0);


}
