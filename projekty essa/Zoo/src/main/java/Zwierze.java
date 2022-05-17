import java.util.Random;

public abstract class Zwierze {
    private String imie;
    private int wiek;
    protected double waga;

    Zwierze(){
        generujWiek();
        generujWage();
    }

    public String jakMaszNaImie() {
        return imie;
    }

    public void nadajImie(String imie) {
        this.imie = imie;
    }

    public int ileMaszLat(){
        wiek++;
        return wiek;
    }

    public double ileWazysz(){
        return waga;
    }


    private void generujWiek(){
        Random r = new Random();
        wiek = r.nextInt()%100 + 100;
    }

    abstract void generujWage();

    @Override
    public String toString() {
        return "Mam na imię " + imie + ".\n" +
                "Mam " + ileMaszLat() + " " + slowoDlaWieku() + ".\n" +
                "Ważę " + waga + " kilogramów" + ".\n";
    }

    private String slowoDlaWieku() {
        if(wiek == 1) return "rok";
        int moduloWiek = wiek % 100;
        if(moduloWiek >= 5 && moduloWiek <= 20) return "lat";
        moduloWiek = wiek%10;
        if (moduloWiek >= 2 && moduloWiek <= 4) return "lata";
        return "lat";

    }

}
