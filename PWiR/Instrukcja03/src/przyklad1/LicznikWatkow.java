package przyklad1;

public class LicznikWatkow {
    private int wartoscKrytyczna;

    public synchronized int policzMnie() throws InterruptedException {
        wartoscKrytyczna += 1;
        Thread.sleep(200);
        wartoscKrytyczna --;
        return wartoscKrytyczna;
    }
}
