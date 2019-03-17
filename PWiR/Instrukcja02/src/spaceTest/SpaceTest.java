package spaceTest;


import space2d.Space2D;
import space3d.Space3D;

public class SpaceTest {

    public static void main(String[] args) {

        Space2D pkt1 = new Space2D(1.5, 2.5);
        Space2D pkt2 = new Space2D(3.5, 0.7);
        Space2D pkt3 = new Space2D();

        Space3D pkt4 = new Space3D(1.5, 2.5, 3.5);
        Space3D pkt5 = new Space3D(1.1, 2.2, 3.3);
        Space3D pkt6 = new Space3D();

        System.out.print("pkt1: ");
        pkt1.showSpace2D();
        System.out.println("pkt1 pkt2 distance = " + pkt1.distance2D(pkt2));
        System.out.println("pkt1 (0,0) distance = " + pkt1.distanceFrom0at2D());
        System.out.println("circuit 2D = " + pkt1.circuitOfTriangle2D(pkt2, pkt3));
        System.out.println("area 2D = " + pkt1.areaOfTriangle2D(pkt2, pkt3));
        System.out.println();
        System.out.print("pkt4: ");
        pkt4.showSpace3D();
        System.out.println("pkt4 (0,0,0) distance = " + pkt4.distanceFrom0at3D());
        System.out.println("circuit 3D = " + pkt4.circuitOfTriangle3D(pkt5, pkt6));
        System.out.println("area 3D = " + pkt4.areaOfTriangle3D(pkt5, pkt6));

    }
}
