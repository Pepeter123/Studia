package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayN {
    public static void main(String[] args) {
        final int SIZE = 10;
        ArrayList<Integer> ar = new ArrayList<>(SIZE);
        Random rd = new Random();
        for (int i = 0; i < SIZE; i++) {
            ar.add(rd.nextInt(100));
        }

        for (int b : ar) {
            System.out.print(b + " ");
        }

/*
        System.out.println();
        ar.sort(null);
// Collections.sort(ar);
        for (Integer b : ar) {
            System.out.print(b + " ");
        }
*/
        System.out.println();
        int min = Collections.min(ar);
        int max = Collections.max(ar);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        int sum = 0;
        for (Integer a : ar) {
            sum += a;
        }
        double avg = (double) sum / SIZE;
        System.out.println("Avg: " + avg);

        int max2 = min;
        for (int i = 0; i < SIZE; i++) {
            if (ar.get(i) > max2 && ar.get(i) != max) {
                max2 = ar.get(i);
            }
        }
        System.out.println("Max2: " + max2);

        int max3 = min;
        for (int i = 0; i < SIZE; i++) {
            if (ar.get(i) > max3 && ar.get(i) != max && ar.get(i) != max2) {
                max3 = ar.get(i);
            }
        }
        System.out.println("Max3: " + max3);

        //reverse

        System.out.println();
        Collections.reverse(ar);

        for (Integer b : ar) {
            System.out.print(b + " ");
        }
        System.out.println();


        int tmp;
        for (int i = 0; i < ar.size() / 2; i++) {
            tmp = ar.get(i);
            ar.set(i, ar.get(ar.size() - 1 - i));
            ar.set(ar.size() - 1 - i, tmp);
        }

        System.out.println("Fist element last etc. :");
        for (int b : ar) System.out.print(b + " ");

    }
}
