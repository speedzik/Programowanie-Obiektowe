import java.util.Objects;
import java.util.Scanner;

public class Point {
    private double x, y;

    Point(){
        x = 0;
        y = 0;
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void wczytaj(){
        Scanner sc = new Scanner(System.in);
        System.out.print("x =");
        x = sc.nextDouble();
        System.out.print("y = ");
        y = sc.nextDouble();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return this.x == point.x && this.y == point.y;
    }

    public static double odleglosc(Point a, Point b){
        return Math.sqrt((Math.pow((a.x - b.x), 2.0) + Math.pow((a.y - b.y), 2.0)));
    }

    public static boolean czyWspoliniowe(Point a, Point b, Point c){
        return a.x*b.y + a.y*c.x + b.x*c.y -  c.x*b.y - a.x*c.y - b.x*a.y == 0.0;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

}
