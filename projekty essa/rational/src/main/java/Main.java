public class Main {
    public static void main(String [] args) {
        Rational a = new Rational(12, -48);
        Rational b = new Rational(32, 26);
        System.out.println(a);
        System.out.println(b);
        Rational c = Rational.plus(a, b);
        System.out.println(a + "+" + b + "=" + c);
        a.add(b);
        System.out.println(a);

       if (c.equals(new Rational(781, 52))){
           System.out.println(" = 51/52");
        }
    }
}

