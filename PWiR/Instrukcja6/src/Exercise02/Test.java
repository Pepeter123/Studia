package Exercise02;

import Exercise02.reader.Reader;
import Exercise02.writer.Writer;

import java.util.concurrent.Semaphore;

public class Test {
    public static  Semaphore sem = new Semaphore(12);
    public static void main(String[] args) {
        final int number = 12;
        Reader[] readers = new Reader[number];
        Writer[] writers = new Writer[number];
        for (int i = 0; i < readers.length; i++) {
            readers[i] = new Reader();
            writers[i] = new Writer();
            Thread t = new Thread(readers[i], "Reader nr " + (i + 1));
            Thread t2 = new Thread(writers[i], "Writer nr " + (i + 1));
            t.start();
            t2.start();
        }
    }
}