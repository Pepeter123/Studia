package Exercise01.test;

import Exercise01.bridge.Bridge;
import Exercise01.car.Car;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Test {

    private final static int SIZE = 6;

    public static void main(String[] args) {

        Random rand = new Random();

        String[] side = {"west", "east"};
        Car[] cars = new Car[SIZE];
        Bridge bridge = new Bridge();
        Thread[] threads = new Thread[SIZE];

        for (int i = 0; i < SIZE; i++) {
            cars[i] = new Car(side[rand.nextInt(side.length)], bridge);
            threads[i] = new Thread(cars[i]);
            threads[i].setName("Car_" + i);
            threads[i].start();

        }

        while (true) {
            try {
                bridge.setRedLight("west");
                bridge.setGreenLight("east");
                TimeUnit.SECONDS.sleep(2);
                bridge.setRedLight("east");
                bridge.setGreenLight("west");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
