import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    private final static int SIZE = 10;

    public static void main(String[] args) throws InterruptedException {

        ArrayBlockingQueue<Integer> kolejka1 = new ArrayBlockingQueue<>(SIZE);
        ArrayBlockingQueue<Integer> kolejka2 = new ArrayBlockingQueue<>(SIZE);

        System.out.println("Program wejściówka - START");

        final int W1_SIZE = 4;
        final int W2_SIZE = 1;
        final int W3_SIZE = 2;

        Watek1[] w1 = new Watek1[W1_SIZE];
        Watek2[] w2 = new Watek2[W2_SIZE];
        Watek3[] w3 = new Watek3[W3_SIZE];

        /*W1*/
        for (int i = 0; i < W1_SIZE; i++) {
            w1[i] = new Watek1(kolejka1);
            w1[i].setName("W1_" + i);
        }

        /*W2*/
        for (int i = 0; i < W2_SIZE; i++) {
            w2[i] = new Watek2(kolejka1, kolejka2);
            w2[i].setName("W2_" + i);
        }

        /*W3*/
        for (int i = 0; i < W3_SIZE; i++) {
            w3[i] = new Watek3(kolejka2);
            w3[i].setName("W3_" + i);
        }

        for (int i = 0; i < W1_SIZE; i++) {
            w1[i].start();
        }
        for (int i = 0; i < W2_SIZE; i++) {
            w2[i].start();
        }
        for (int i = 0; i < W3_SIZE; i++) {
            w3[i].start();
        }


    }
}
