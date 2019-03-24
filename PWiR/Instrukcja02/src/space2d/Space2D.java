package space2d;

public class Space2D {
    private double x;
    private double y;

    public Space2D() {
        x = 0.0;
        y = 0.0;
    }

    public Space2D(double a, double b) {
        this.x = a;
        this.y = b;
    }

    protected void setX(double x) {
        this.x = x;
    }

    protected double getX() {
        return this.x;
    }

    protected void setY(double y) {

        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void showSpace2D() {
        System.out.print("X = " + x);
        System.out.println(" Y = " + y);
    }

    @Override
    public String toString() {
        return "X = " + this.x + " Y = " + this.y;
    }

   public double distance2D(Space2D pkt2) {
        return Math.sqrt(Math.pow((pkt2.x - this.x), 2) + Math.pow((pkt2.y - this.y), 2));
    }

    public double distanceFrom0at2D() {
        return Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    public double circuitOfTriangle2D(Space2D pkt2, Space2D pkt3) {
        double ab = Math.sqrt(Math.pow((pkt2.x - this.x), 2) + Math.pow((pkt2.y - this.y), 2));
        double bc = Math.sqrt(Math.pow((pkt3.x - pkt2.x), 2) + Math.pow((pkt3.y - pkt2.y), 2));
        double ca = Math.sqrt(Math.pow((this.x - pkt3.x), 2) + Math.pow((this.y - pkt2.y), 2));
        return ab + bc + ca;
    }

    public double areaOfTriangle2D(Space2D pkt2, Space2D pkt3) {
        double ab = Math.sqrt(Math.pow((pkt2.x - this.x), 2) + Math.pow((pkt2.y - this.y), 2));
        double bc = Math.sqrt(Math.pow((pkt3.x - pkt2.x), 2) + Math.pow((pkt3.y - pkt2.y), 2));
        double ca = Math.sqrt(Math.pow((this.x - pkt3.x), 2) + Math.pow((this.y - pkt2.y), 2));
        double p = ((ab + bc + ca) / 2);
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));


    }





}
