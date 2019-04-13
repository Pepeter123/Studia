package przyklad2;

public class SafePointPrinter {
    public void print(Point p) {
        float safeX, safeY;

        synchronized (p) {
// te dwie linie będą tworzyły
            safeX = p.x(); // sekcję
            safeY = p.y(); // krytyczną
        }
        System.out.println(
                "Wspolzedne punktu: x = "
                        + safeX //p.x()
                        + ", y = "
                        + safeY //p.y()
                        + ".");
    }
}
