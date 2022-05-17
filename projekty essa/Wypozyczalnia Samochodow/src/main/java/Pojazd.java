import java.util.Random;

public abstract class Pojazd {
        private String numer_rejestracji;
        private String vin;
        private String kolor;
        private int cena;
        protected double spalanie;
        private boolean stan_paliwa = false;
        private int licznik;

        Pojazd(){
            generujStan_paliwa();
            generujSpalanie();
        }

        public void setKolor(String kolor) {
            this.kolor = kolor;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }

        public void setCena(int cena) {
            this.cena = cena;
        }

        public void setNumer_rejestracji(String numer_rejestracji) {
            this.numer_rejestracji = numer_rejestracji;
        }

        abstract void generujSpalanie();

        public void generujStan_paliwa(){
            Random r = new Random();
            stan_paliwa = r.nextBoolean();
        }

        public boolean jedz(boolean stan_paliwa){
            Random r = new Random();
            if(stan_paliwa = true){
                int dystans = r.nextInt()*100+100;
                licznik = licznik + dystans;
                return false;
            }
            return stan_paliwa;
        }
        public boolean tankuj(boolean stan_paliwa){
            if(stan_paliwa = false){
                stan_paliwa= true;
            }
            return stan_paliwa;
        }


        @Override
        public String toString() {
            return               "numer_rejestracji='" + numer_rejestracji + '\'' +
                    ", vin='" + vin + '\'' +
                    ", kolor='" + kolor + '\'' +
                    ", cena=" + cena +
                    ", spalanie=" + spalanie +
                    ", stan_paliwa=" + stan_paliwa +
                    ", licznik=" + licznik +
                    '}';
        }
    }



}
