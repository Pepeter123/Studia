package Exercise01.car;

import Exercise01.bridge.Bridge;

public class Car implements Runnable {

    private String direction;
    private Bridge bridge;

    public Car(String direction, Bridge bridge) {
        this.direction = direction;
    }


    @Override
    public void run() {
        if (this.direction.equals("west")) {
            while (this.bridge.getWestSemaphore().availablePermits() == 1) {
                System.out.println(Thread.currentThread().getName() + " Went through the bridge");

            }
            else
        }

    }
}
