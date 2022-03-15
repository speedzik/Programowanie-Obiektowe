import java.util.Scanner;

public class Skaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[] a = new Object[3];

        System.out.println("Podaj wartość rzeczywistą: ");
        a[0] = scanner.nextDouble();
        System.out.println("Podaj wartość całkowitą: ");
        a[1] = scanner.nextInt();
        System.out.println("Podaj wartość rzeczywistą z mniejszą dokładnością: ");

        a[2] = scanner.nextFloat();

        for (int i = 0; i < 3; i++) {
            System.out.println("Wpisałeś: " + a[i]);
        }
    }
}
