package test;

import minMax.MinMax;

import java.util.Arrays;
import java.util.Random;

public class Test {
    private static int SIZE = 130000000;
    private static int numberOfThreads = 10;
    private static Random rd = new Random();
    private static int[] ar = new int[SIZE];
    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
        Test.ar = array;
    }

    public static void main(String[] args) throws InterruptedException {

        fillArray(ar);

        long runTimeStart = System.currentTimeMillis();
/*
        for (int i : ar) {
            System.out.print(i + " ");

       }
 */

        Thread[] t = new Thread[numberOfThreads];
        MinMax[] minMaxArray = new MinMax[numberOfThreads];


        for (int i = 0; i < numberOfThreads; i++) {
            minMaxArray[i] = new MinMax(getPart(i, numberOfThreads, ar));

            t[i] = new Thread(minMaxArray[i]);
            t[i].start();
            t[i].join();
        }

        int min = minMaxArray[0].getMinimum(), max = minMaxArray[0].getMaximum(), sum=0;

        for (int i = 0; i < numberOfThreads; i++) {

            if (minMaxArray[i].getMinimum() < min) {
                min = minMaxArray[i].getMinimum();
            }
            if (minMaxArray[i].getMaximum() > max) {
                max = minMaxArray[i].getMaximum();
            }
            sum += minMaxArray[i].getSum();

        }
        System.out.println();
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        long runTimeEnd = System.currentTimeMillis();
        System.out.println("Run Time: " + (runTimeEnd - runTimeStart) + "ms");
    }

    private static int[] getPart(int i, int numberOfThreads, int[] arr) {
        int[] newArray = Arrays.copyOfRange(arr, (i * arr.length) / numberOfThreads, (i + 1) * arr.length / numberOfThreads);
      /*
        System.out.println();
        System.out.print("Array: ");
        for(int a: newArray){
            System.out.print(a + " ");
        }
       */
        return newArray;
    }
}

// time without threads = 2-9ms
// time with one thread = 3-7ms

// 100M elemnts
// 1 thread = 4,3s
// 2 threads = 4,4s
// 4 threads = 4,4s
//6 threads = 4,3s