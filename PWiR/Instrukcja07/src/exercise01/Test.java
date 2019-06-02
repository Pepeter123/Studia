package exercise01;

import exercise01.confectioner.Confectioner;
import exercise01.packager.Packager;
import exercise01.paletter.Paletter;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        int size = 3;
        ArrayBlockingQueue<Integer> conveyorBelt = new ArrayBlockingQueue<>(size);

        ArrayBlockingQueue<Integer> secondConveyorBelt = new ArrayBlockingQueue<>(size);

        final int numConfectioners = 1;
        final int numPackagers = 1;
        final int numPaletters = 1;


        Confectioner[] confectioners = new Confectioner[numConfectioners];
        Thread[] threads = new Thread[numConfectioners + numPackagers];
        for (int i = 0; i < confectioners.length; i++) {
            confectioners[i] = new Confectioner(conveyorBelt);
            threads[i] = new Thread(confectioners[i]);
            threads[i].setName("Confectioner" + (i + 1));
            threads[i].start();
        }

        Packager[] packagers = new Packager[numPackagers];
        for (int i = 0, j = confectioners.length; i < packagers.length; i++, j++) {
            packagers[i] = new Packager(conveyorBelt, secondConveyorBelt);
            threads[j] = new Thread(packagers[i]);
            threads[j].setName("Packager" + (i + 1));
            threads[j].start();
        }

        Paletter[] paletters = new Paletter[numPaletters];
        for (int i = 0, k = packagers.length; i < paletters.length; i++, k++) {
            paletters[i] = new Paletter(secondConveyorBelt);
            threads[k] = new Thread(paletters[i]);
            threads[k].setName("Packager" + (i + 1));
            threads[k].start();
        }


    }

}



