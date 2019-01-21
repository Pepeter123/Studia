package threads15;

public class Threads15 implements Runnable{

    private int id;

    Threads15(int id){
        this.id = id;
    }

    @Override
    public void run(){

            System.out.println("Watek "+id);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();

        }
    }
}