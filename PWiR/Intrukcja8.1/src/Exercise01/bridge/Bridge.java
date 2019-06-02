package Exercise01.bridge;

import java.util.concurrent.Semaphore;

public class Bridge {

    public int getSemaphore(String direction)
    {
        if(direction.equals("east")) return eastSemaphore.availablePermits();

        else if(direction.equals("west")) return westSemaphore.availablePermits();

        return 0;
    }

    private Semaphore eastSemaphore = new Semaphore(0);
    private Semaphore westSemaphore = new Semaphore(0);

    public void setRedLight(String direction) throws InterruptedException {
        if (direction.equals("east"))
            eastSemaphore.acquire();
        else westSemaphore.acquire();
    }

    public void setGreenLight(String direction) {
        if (direction.equals("east"))
            eastSemaphore.release();
        else westSemaphore.release();
    }

}
