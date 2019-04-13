package threads3;

public class Test {
    public static synchronized void main(String[] args) throws InterruptedException{
        Thread[] t = new Thread[3];
        for(int i=0; i<t.length; i++){
            t[i] = new Thread(new Threads3());
            t[i].start();
            t[i].join();
        }
        System.out.println("Koniec Programu");


    }
}
