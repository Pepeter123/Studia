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
        while (this.bridge.getSemaphore(direction) == 1) {
            System.out.println(Thread.currentThread().getName() + " from " + direction + " Went through the bridge");
            break;
        }
        while (this.bridge.getSemaphore(direction) == 1) {
            System.out.println(Thread.currentThread().getName() + " from " + direction + " Went through the bridge");
            break;
        }

        System.out.println(Thread.currentThread().getName() + " is waiting");
    }

}

