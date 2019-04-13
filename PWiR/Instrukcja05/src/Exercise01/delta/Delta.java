package Exercise01.delta;

import Exercise01.data.Data;

public class Delta implements Runnable {
    private double delta = 0.0;
    Data data = new Data();

    public Delta(Data d) {
        this.data = d;
    }

    @Override
    public void run() {
        delta = (Math.pow(data.getB(), 2) - 4 * data.getA() * data.getC());
        System.out.println("Delta: " + delta);
    }

    public double getDelta() {

        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

}
