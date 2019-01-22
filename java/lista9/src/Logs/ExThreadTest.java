package Logs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExThreadTest extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread[] l = new Thread[3];
        for (int i = 0; i < l.length; i++) {
            l[i] = new Thread(new LogsFightRun()); //nowy watek, ktory jako parametr przyjmuje LogsFight
            l[i].start();
        }
        Thread t = new Thread(new LogsTest());
        t.start();
    }

    @Override
    public void run() {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("Logs.txt"));
            Scanner sc = new Scanner(new File("Logs.txt"));

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
