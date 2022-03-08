public class Main {
    public static void main (String[] args){
        Point a = new Point(2, 6);
        Point b = new Point(3, 5);

        b.x = 2;
        b.y = b.x+1;

        Rectangle r = new Rectangle(a,b);
        int ar = r.area();
        /* System.out.println(ar); */
        System.out.println("Powierzchnia wynosi: " + ar);

    }
}
