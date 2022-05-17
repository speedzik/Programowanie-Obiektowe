import java.util.Random;

public class Rekin extends Zwierze implements Miesozercy{
    @Override
    void generujWage() {
        Random r = new Random();
        waga = r.nextInt()%400 + 400;
    }
    @Override
    public String toString() {
        return "Jestem rekinem.\n" + super.toString();
    }

    @Override
    public void jedzMieso(double wagaMiesa) {
        waga = wagaMiesa * 0.5;
    }
}
