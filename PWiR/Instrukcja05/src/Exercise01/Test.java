package Exercise01;

import Exercise01.data.Data;
import Exercise01.delta.Delta;
import Exercise01.roots.Roots;

public class Test {
    private static Data data = new Data();
    private static Delta delta = new Delta(data);

    public static void main(String[] args){

        Thread roots = new Thread(new Roots(data, delta));

        data.run();
        delta.run();
        roots.run();


    }
}