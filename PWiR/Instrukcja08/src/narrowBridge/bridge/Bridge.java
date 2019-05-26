package narrowBridge.bridge;

import java.util.concurrent.Semaphore;

public class Bridge {

    public static Semaphore semaphoreWest = new Semaphore(1);
    public static Semaphore semaphoreEast = new Semaphore(0);


}
