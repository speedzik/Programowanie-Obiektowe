import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String w = scanner.nextLine();
        w = w.replace(" ","");
        int d = w.length();

        boolean ll = false;

        for (int left = 0, right = d - 1; left < right; left++, right--) {

            if (w.charAt(left) != w.charAt(right)) {
                ll = true;
                break;
            }
        }
        if (ll) {
            System.out.println("To nie palindrom ;(");
        } else {
            System.out.println("To palindrom ;)");
        }
    }
}
