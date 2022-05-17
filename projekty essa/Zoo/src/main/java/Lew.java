import java.util.Random;

public class Lew extends Zwierze implements Miesozercy {
    @Override
    void generujWage() {
        Random r = new Random();
        waga = r.nextInt()%100 + 100;
    }

    @Override
    public String toString() {
        return "Jestem lwem.\n" + super.toString();
    }

    @Override
    public void jedzMieso(double wagaMiesa) {
        waga += wagaMiesa * 0.7;
    }
}
