import java.util.Arrays;

public class Triangle implements ITriangle {
    private Point[] t = new Point[3];

    Triangle(){
        t[0] = new Point(0,0);
        t[1] = new Point(0,1);
        t[2] = new Point(1,0);
    }

    Triangle(Point a, Point b, Point c){
        assert !Point.czyWspoliniowe(a, b ,c);

        t[0] = a;
        t[1] = b;
        t[2] = c;
    }

    @Override
    public String toString() {
        return "[" + t[0] + "," + t[1] + "," + t[2] + "]";
    }

    @Override
    public void wczytaj(){
        System.out.println("a:");
        t[0].wczytaj();
        System.out.println("b:");
        t[1].wczytaj();
        System.out.println("c:");
        t[2].wczytaj();

        assert !Point.czyWspoliniowe(t[0], t[1], t[2]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        for (int i = 0; i<3; i++){
            if(!t[i].equals(triangle.t[i])){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(t);
    }

    public boolean czyRownoboczny(){
        return Point.odleglosc(t[0], t[1]) == Point.odleglosc(t[1], t[2]) && Point.odleglosc(t[0], t[1]) == Point.odleglosc(t[0], t[2]);
    }

    private double pole(){
        double d = Point.odleglosc(t[0],t[1]);
        return d * d * Math.sqrt(3.0) / 4.0;
    }

    @Override
    public String obliczPole(){
        if(czyRownoboczny()) {
            return "Pole wynosi:" + String.valueOf(pole());
        } else{
            return "Nie jest rownoboczny";
        }
    }

    @Override
    public void move(double x, double y) {
        for(int i = 0; i<3; i++){
            t[i].move(x,y);
        }
    }


}
