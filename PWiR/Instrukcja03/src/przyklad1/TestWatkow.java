package przyklad1;

public class TestWatkow {
    public static void main(String[] args){

        int tnum = 10; // liczba watkow
        int count = 5; // liczba powtorzen w petli run()

        // tworzenie obiektu
        LicznikWatkow licznik = new LicznikWatkow();

        // tworzenie i uruchomienie watku
        WatekLiczacy[] thread = new WatekLiczacy[tnum];
        for (int i = 0; i < tnum; i++)
            thread[i] = new WatekLiczacy("Watek" + (i+1), licznik, count);

        try {
            for (int i = 0; i < tnum; i++) {thread[i].join();}
        } catch (InterruptedException exc) { System.exit(1); }
        System.out.println("Koniec programu");

        }
 }

