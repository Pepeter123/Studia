package minMax;


import java.util.Arrays;

public class MinMax extends Thread {
    final private static int SIZE = 10;
    public static int[] a1 = new int[SIZE];
    private int[] a2;
    private int minimum;
    private int maximum;
    private int sum;

  public MinMax(int[] a2){

    countAll();
  }
   private int min() {
        Arrays.sort(a1);
        return minimum = a1[0];
    }

    private  int max() {
        Arrays.sort(a1);
        return maximum = a1[SIZE - 1];
    }

    private int sum() {
        int s = 0;
        for (int e : a1
        ) {
            s += e;
        }
        return sum = s;
    }

    private void countAll(){
      min();
      max();
      sum();
    }


    @Override
    public void run() {
        /*
        System.out.println("\nMin: " + min());
        System.out.println("Max: " + max());
        System.out.println("Sum: " + sum());
 */
    }

    public static int getMinimum() {
        return minimum;
    }

    public static int getMaximum() {
        return maximum;
    }

    public static int getSum() {
        return sum;
    }

}


