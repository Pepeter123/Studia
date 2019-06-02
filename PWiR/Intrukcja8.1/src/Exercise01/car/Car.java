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
        while (true) {
            if (this.bridge.getWestSemaphore().availablePermits() == 1) {
                if (direction.equals("west")) {
                    System.out.println(Thread.currentThread().getName() + " from " + direction + " Went through the bridge");
                    break;
                }
            } else {
                if (direction.equals("east")) {
                    System.out.println(Thread.currentThread().getName() + " from " + direction + " Went through the bridge");
                    break;
                }
            }
        }
    }
}

