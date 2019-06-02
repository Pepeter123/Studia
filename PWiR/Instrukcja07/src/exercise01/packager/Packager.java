package exercise01.packager;

import java.util.concurrent.ArrayBlockingQueue;

public class Packager implements Runnable {

    private ArrayBlockingQueue<Integer> conveyorBelt;

    private ArrayBlockingQueue<Integer> secondConveyorBelt;

    public Packager(ArrayBlockingQueue<Integer> conveyorBelt, ArrayBlockingQueue<Integer> secondConveyorBelt) {
        this.conveyorBelt = conveyorBelt;
        this.secondConveyorBelt = secondConveyorBelt;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer a = conveyorBelt.take();
                System.out.println(Thread.currentThread().getName() + " packed wafer " + a);
                secondConveyorBelt.put(a);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
