package przyklad2;

public class Point {
    private float x, y;

    public float x() {
//nie potrzeba synchronizacji
        return x;
    }

    public float y() {//jak wyżej
        return y;
    }


}
