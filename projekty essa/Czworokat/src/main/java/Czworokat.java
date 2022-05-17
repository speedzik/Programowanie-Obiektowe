import java.util.Scanner;
public class Czworokat {

    final private Punkt TL;
    final private Punkt TR;
    final private Punkt BR;
    final private Punkt BL;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] punkty = new double[8];
        




        Punkt czworokatTL = new Punkt(2.0, 4.0);
        Punkt czworokatTR = new Punkt(5.0, 4.0);
        Punkt czworokatBR = new Punkt(4.0, 2.0);
        Punkt czworokatBL = new Punkt(3.0, 2.0);
        Czworokat czworokat = new Czworokat(czworokatBL,czworokatBR,czworokatTL,czworokatTR);


    }



    public Czworokat(Punkt[] punkty) {
        this.TL = punkty[0];
        this.TR = punkty[1];
        this.BR = punkty[2];
        this.BL = punkty[3];
    }

    public Czworokat(Punkt pt1, Punkt pt2, Punkt pt3, Punkt pt4){
        this.TL = pt1;
        this.TR = pt2;
        this.BR = pt3;
        this.BL = pt4;
    }


    public Punkt getTL() {
        return TL;
    }

    public Punkt getTR() {
        return TR;
    }

    public Punkt getBR() {
        return BR;
    }

    public Punkt getBL() {
        return BL;
    }


    public Punkt[] getPoints() {
        Punkt[] punkty = new Punkt[4];
        punkty[0] = this.getTL();
        punkty[1] = this.getTR();
        punkty[2] = this.getBR();
        punkty[3] = this.getBL();

        return punkty;
    }
}