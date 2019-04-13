package minMax;

public class MinMax extends Thread {
    private int[] tab;
    private int minimum;
    private int maximum;
    private int sum;

    public MinMax(int[] tab) {
        this.tab = tab;
    }

    private void countMinMaxSum() {
        minimum = tab[0];
        maximum = tab[0];
        for (int value : tab) {
            if (value < minimum)
                minimum = value;
            if (value > maximum)
                maximum = value;
            sum += value;
        }
    }

    @Override
    public void run() {
/*
        System.out.println();
        for (int i : tab)
          System.out.print(i + " ");
*/
        this.countMinMaxSum();

//        System.out.println("\n" + getMinimum() + " "  + getMaximum() + " " + getSum());

    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getSum() {
        return sum;
    }

}


