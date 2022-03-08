public class Auto {
    String nazwa;
    String typ;
    double pojemnosc;
    int rocznik;
    int pojemnosc_baku;
    String kolor;
    boolean stansilnika;


    Auto(String nazwa, String typ, double pojemnosc, int rocznik, int pojemnosc_baku, String kolor){
        this.nazwa = nazwa;
        this.typ = typ;
        this.pojemnosc = pojemnosc;
        this.pojemnosc_baku = pojemnosc_baku;
        this.kolor = kolor;
    }
        void stansilnika(){

        }

    public static void main(String [] args){
        Auto Polonez = new Auto("szerszen", "sedan", 5.0, 1999, 40, "granatowy");
        System.out.println(Polonez.nazwa);
    }
}
