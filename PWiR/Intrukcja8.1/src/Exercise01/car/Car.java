package Exercise01.car;

import Exercise01.bridge.Bridge;

public class Car implements Runnable {

    private String direction;
    private Bridge bridge;

    public Car(String direction, Bridge bridge) {
        this.direction = direction;
        this.bridge = bridge;
    }


    @Override
    public void run() {
        if (this.bridge.getWestSemaphore().availablePermits() == 1) {
            while (direction.equals("west")) {
                System.out.println(Thread.currentThread().getName() + " from " + direction + " Went through the bridge");
                break;
            }
        } else if (this.bridge.getEastSemaphore().availablePermits() == 1) {
            while (direction.equals("east")) {
                System.out.println(Thread.currentThread().getName() + " from " + direction + " Went through the bridge");
                break;
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " is waiting");
        }
    }
}

