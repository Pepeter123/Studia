package PackSpace2D;

import static java.lang.StrictMath.sqrt;

public class Space2D {
    private double x;
    private double y;

    Space2D() {
        x = 0;
        y = 0;
    }

    Space2D(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public void showSpace2D() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    String toStringSpace2D() {
        return "X = " + this.x + " Y = " + this.y;
    }

    public double distance(Space2D pkt2) {
        return Math.sqrt(Math.pow((pkt2.x - this.x), 2) + Math.pow((pkt2.y - this.y), 2));
    }

    public double distance0() {
        return Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    public double circuitOfTriangle(Space2D pkt2, Space2D pkt3) {
        double ab = Math.sqrt(Math.pow((pkt2.x - this.x), 2) + Math.pow((pkt2.y - this.y), 2));
        !!!!!!!!!!!!double bc = Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
        double ca = Math.sqrt(Math.pow((this.x - pkt3.x), 2) + Math.pow((this.y = pkt2.y), 2));
        return ab + bc + ca;
    }


    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }


}
