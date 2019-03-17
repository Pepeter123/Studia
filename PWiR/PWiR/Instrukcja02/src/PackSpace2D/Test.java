package PackSpace2D;


public class Test {

    public static void main(String[] args) {

        Space2D pkt1 = new Space2D(1.5, 2.5);
        Space2D pkt2 = new Space2D(3.5, 2.5);
        Space2D pkt3 = new Space2D(1.5,0.0);


        System.out.println(pkt1.distance(pkt2));



    }
}
