public class Rational {
    private int licz;
    private int mian;

    public Rational(int licz, int mian) {
        this.licz = licz;
        this.mian = mian;
        skroc();
        minusprzedlicznikiem();

    }
    private boolean niezmiennik() {
        return mian > 0 && GCD(licz, mian) == 1;
    }

    private void skroc() {
        int g = GCD(licz, mian);
        licz /= g;
        mian /= g;
    }

    public static Rational plus(Rational a, Rational b) {
        assert a.niezmiennik() && b.niezmiennik();
        Rational r = new Rational(a.licz, a.mian);
        r.add(b);
        assert r.niezmiennik();
        equals
        return r;

    }

    private int GCD(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    private void minusprzedlicznikiem() {
        if (mian < 0) {
            licz = -licz;
            mian = -mian;
        }
    }

    @Override
    public String toString() {
        return licz + "/" + mian;
    }

    public void add(Rational b) {
        int g = GCD(mian, b.mian);
        licz = licz / g * b.mian + b.licz / g * mian;
        mian = mian * b.mian / g;
        skroc();
    }
    public void sub(Rational b) {
        Rational t = new Rational(-b.licz, b.mian);
        this.add(t);
    }
    public boolean equals(Object o){
        if(!(o instanceof Rational)) return false;
        Rational r = (Rational) o;
        return (licz == r.licz && mian == r.mian);
    }

}
