import java.sql.SQLOutput;

public class Zoo {
    public static void main(String[] args) {
        Rekin rekin = new Rekin();
        rekin.nadajImie("Major");
        rekin.jedzMieso(10);


        Lew lew = new Lew();
        lew.nadajImie("Simba");
        lew.jedzMieso(12.3);


        Slon slon = new Slon();
        slon.nadajImie("Mały");
        slon.jedzMieso(1);
        slon.jedzRosliny(23.6);


        Zebra zebra = new Zebra();
        zebra.nadajImie("Panda");
        zebra.jedzRosliny(21);


        Orzel orzel = new Orzel();
        orzel.nadajImie("Marcin");
        orzel.jedzMieso(1.2);

        Zwierze[] zoo = new Zwierze[5];
        zoo[0] = lew;
        zoo[1] = slon;
        zoo[2] = rekin;
        zoo[3] = zebra;
        zoo[4] = orzel;

        for (Zwierze zwierze:zoo){
            System.out.println(zwierze);
        }

    }
}
