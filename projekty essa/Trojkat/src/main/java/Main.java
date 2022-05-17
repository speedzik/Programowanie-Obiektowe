import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p);

        ITriangle t = new Triangle();
        ITriangle v = new Triangle();
        t.wczytaj();
        v.wczytaj();

        System.out.println("Czy rowne: " + t.equals(v));

        System.out.println("Pole t: " + t.obliczPole());
        System.out.println("Pole v: " + v.obliczPole());

        t.move(2, 3);
        System.out.println(t);

    }
}
