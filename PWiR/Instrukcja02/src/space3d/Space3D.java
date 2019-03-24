package space3d;

import space2d.Space2D;

public class Space3D extends Space2D {


    private double z;

    public Space3D() {
        super();
        z = 0.0;
    }


    public Space3D(double a, double b, double c) {
        setX(a);
        setY(b);
        setZ(c);
    }

    private double getZ() {
        return z;
    }

    private void setZ(double z) {
        this.z = z;
    }

    public void showSpace3D() {
        System.out.print("X = " + getX());
        System.out.print(" Y = " + getY());
        System.out.println(" Z = " + z);
    }

    private double distance3D(Space3D pkt2) {
        return Math.sqrt(Math.pow((pkt2.getX() - this.getX()), 2) + Math.pow((pkt2.getY() - this.getY()), 2) + Math.pow((pkt2.z - getZ()), 2));
    }

    public double distanceFrom0at3D() {
        return Math.sqrt(Math.pow((0 - this.getX()), 2) + Math.pow((0 - this.getY()), 2) + Math.pow((0 - this.z), 2));

    }

    @Override
    public String toString() {
        return "X = " + this.getX() + " Y = " + this.getY() + " Z = " + this.z;
    }

    public double circuitOfTriangle3D(Space3D pkt2, Space3D pkt3) {
        double ab = Math.sqrt(Math.pow((pkt2.getX() - this.getX()), 2) + Math.pow((pkt2.getY() - this.getY()), 2) + Math.pow((pkt2.z - this.z), 2));
        double bc = Math.sqrt(Math.pow((pkt3.getX() - pkt2.getX()), 2) + Math.pow((pkt3.getY() - pkt2.getY()), 2)) + Math.pow((pkt3.z - this.z), 2);
        double ca = Math.sqrt(Math.pow((this.getX() - pkt3.getX()), 2) + Math.pow((this.getY() - pkt2.getY()), 2)) + Math.pow((this.z - pkt2.z), 2);
        return ab + bc + ca;
    }

    public double areaOfTriangle3D(Space3D pkt2, Space3D pkt3) {
        double ba = this.distance3D(pkt2);
        double ca = this.distance3D(pkt3);
        double cb = pkt2.distance3D(pkt2);
        double p = circuitOfTriangle3D(pkt2, pkt3);
        return Math.sqrt(p * (p - ba) * (p - ca) * (p - cb));
    }


}
