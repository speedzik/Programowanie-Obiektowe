import java.util.Random;

public class Slon extends Zwierze implements Roslinozercy, Miesozercy{
    @Override
    void generujWage() {
        Random r = new Random();
        waga = r.nextInt()%500 + 500;
    }
    @Override
    public String toString() {
        return "Jestem słoniem.\n" + super.toString();
    }

    @Override
    public void jedzRosliny(double wagaRoslin) {
        waga += wagaRoslin * 0.8;
    }

    @Override
    public void jedzMieso(double wagaMiesa) {
        waga += wagaMiesa * 0.3;
    }
}
