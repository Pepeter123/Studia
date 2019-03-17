package HighestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GetHighestNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] t1 = new int[5];
        int[] t2 = new int[5];
        int[] t3 = new int[5];
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < t1.length; i++) {
            t1[i] = rd.nextInt(100);
            System.out.print(t1[i] + " ");
            if (t1[i] > max1  ) {
                max1 = t1[i];
            }
        }
        System.out.println();
        System.out.println("Max1: "+max1);
        ar.add(max1);
        for (int i = 0; i < t2.length; i++) {
            t2[i] = rd.nextInt(100);
            System.out.print(t1[i] + " ");
            if (t2[i] > max2  ) {
                max2 = t2[i];
            }
        }
        System.out.println();
        System.out.println("Max2: "+max2);
        ar.add(max2);
        for (int i = 0; i < t3.length; i++) {
            t3[i] = rd.nextInt(100);
            System.out.print(t1[i] + " ");
            if (t3[i] > max3  ) {
                max3 = t3[i];
            }
        }
        System.out.println();
        System.out.println("Max3: "+max3);
        ar.add(max3);

        System.out.println("Max of all arrays: "+Collections.max(ar));


    }
}
