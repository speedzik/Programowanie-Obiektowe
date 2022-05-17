import java.util.Random;

public class Zebra extends Zwierze implements Roslinozercy{
    @Override
    void generujWage() {
        Random r = new Random();
        waga = r.nextInt()%200 + 200;
    }
    @Override
    public String toString() {
        return "Jestem zebrą.\n" + super.toString();
    }

    @Override
    public void jedzRosliny(double wagaRoslin) {
        waga += wagaRoslin * 0.8;
    }
}
