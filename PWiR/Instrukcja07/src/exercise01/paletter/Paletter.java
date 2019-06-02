package exercise01.paletter;

import java.util.concurrent.ArrayBlockingQueue;

public class Paletter implements Runnable {

    private ArrayBlockingQueue<Integer> conveyorBelt;
    private ArrayBlockingQueue<Integer> secondConveyorBelt;

    public Paletter(ArrayBlockingQueue<Integer> conveyorBelt, ArrayBlockingQueue<Integer> secondConveyorBelt) {
        this.conveyorBelt = conveyorBelt;
        this.secondConveyorBelt = secondConveyorBelt;

    }

    @Override
    public void run() {
        while(true){
            try {
                for (int i = 0; i < 4; i++) {
                    int a = conveyorBelt.take();
                    System.out.println(Thread.currentThread().getName() + " took " + a);

                    if(i==3) {
                        System.out.println(Thread.currentThread().getName() + " packed 4 products on palette");
                        Thread.sleep(2000);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
