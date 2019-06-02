package Exercise01.filozof;

import java.util.Random;

public class Filozof extends Thread {

    protected static class Paleczka {
        protected int ja; // numer uzywajacego
        protected boolean wUzyciu; // true jeżeli paleczka jest w uzyciu

        public Paleczka(int ja) {
            this.ja = ja;
        }

        public synchronized boolean pobierz(int kto) {
            System.err.println(kto + (wUzyciu ? " >< brak " : " => chwyta ")
                    + ja);
            return wUzyciu ? false : (wUzyciu = true);
        }

        public synchronized void odluz(int kto) {
            System.err.println(kto + " <= pozostawia " + ja);
            wUzyciu = false;
            notify();
        }

        public synchronized void czeka(int kto) {
            while (!pobierz(kto))
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

    protected static Random random = new Random(); // randomize
    protected static int ja; // numer do śledzenia
    protected static Paleczka lewa, prawa; // moje paleczki

    public Filozof(int ja, Paleczka lewa, Paleczka prawa) {
        this.ja = ja;
        this.lewa = lewa;
        this.prawa = prawa;
    }

    public static void main(String args[]) {
        int liczbaPaleczekIFilozofow = 5;
        Paleczka paleczki[] = new Paleczka[liczbaPaleczekIFilozofow];
        for (int i = 0; i < liczbaPaleczekIFilozofow; ++i) {
            paleczki[i] = new Paleczka(i);
        }
        Filozof filozofowie[] = new Filozof[liczbaPaleczekIFilozofow];
        filozofowie[0] = new Filozof(0, paleczki[4], paleczki[0]);
        for (int j = 1; j < liczbaPaleczekIFilozofow; ++j) {
            filozofowie[j] = new Filozof(j, paleczki[j - 1], paleczki[j]);
        }
        for (int k = 0; k < liczbaPaleczekIFilozofow; ++k) {
            filozofowie[k].start();
        }
        public void run () { /** flozof: mysli i je 2 razy. */
            for (int n = 1; n <= 2; ++n) {
                System.out.println(ja + " MYŚLI");
                try {
                    Thread.sleep((long) (random.nextFloat() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (true)
                    try {
                        lewa.czeka(ja);
                        if (prawa.pobierz(ja)) {
                            System.out.println(ja + " JEM");
                            try {
                                Thread.sleep((long) (random.nextFloat() * 1000));
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            prawa.odluz(ja);
                            break;
                        }
                    } finally {
                        lewa.odluz(ja);
                        Thread.yield();
                    }
            }
            System.out.println(ja + " ====> WYCHODZI");
        }
    }
}
