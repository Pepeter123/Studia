package Exercise01.roots;

import Exercise01.data.Data;
import Exercise01.delta.Delta;

public class Roots implements Runnable {
    private double x1 = 0.0;
    private double x2 = 0.0;
    Data data = new Data();
    Delta delta = new Delta(data);

    public Roots(Data dat, Delta del) {
        this.data = dat;
        this.delta = del;
    }

    @Override
    public void run() {
        try {
            Delta.semaphore.acquire();

            if (delta.getDelta() < 0) System.out.println("There is no roots for delta < 0");
            else {
                setX1((-1 * data.getB() - Math.sqrt(delta.getDelta())) / (2 * data.getA()));
                setX2((-1 * data.getB() + Math.sqrt(delta.getDelta())) / (2 * data.getA()));
                System.out.println("x1 = " + getX1() + " x2 = " + getX2());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Delta.semaphore.release();

    }


    private double getX1() {
        return x1;
    }

    private void setX1(double x1) {
        this.x1 = x1;
    }

    private double getX2() {
        return x2;
    }

    private void setX2(double x2) {
        this.x2 = x2;
    }

}
