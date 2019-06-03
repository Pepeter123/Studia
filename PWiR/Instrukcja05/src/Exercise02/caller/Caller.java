package Exercise02.caller;

import Exercise02.Ring;

public class Caller implements Runnable {

    private static int id = 0;
    private int callerID;

    public Caller() {
        id++;
        callerID = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("caller " + getId() + " is waiting");
                Ring.semaphore.acquire();
                System.out.println("caller " + getId() + " ring");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("caller " + getId() + " ended");
            System.out.println();
            Ring.semaphore.release();
        }
    }

    private int getId() {
        return this.callerID;
    }
}
