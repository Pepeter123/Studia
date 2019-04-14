package Exercise01.delta;

import Exercise01.data.Data;

import java.util.concurrent.Semaphore;

public class Delta implements Runnable {
    private double delta = 0.0;
    Data data = new Data();

    Semaphore semaphore;

    public Delta(Data d) {
        this.data = d;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();

            delta = (Math.pow(data.getB(), 2) - 4 * data.getA() * data.getC());
            System.out.println("Delta: " + delta);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();

    }

    public double getDelta() {

        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

}
