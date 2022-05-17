
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();
        double[] t = new double[rozmiar];

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("wyniki.txt");

            fileWriter.write("Orgyinalna tablica:\n");

            double suma = 0.0;

            for (int i = 0; i < t.length; i++) {
                System.out.println("Podaj liczbę na miejscu: " + i);
                double el = scanner.nextDouble();
                fileWriter.write(el + " ");
                t[i] = el;
                suma += el;
            }
            double srednia = suma / rozmiar;

            Arrays.sort(t);

            double mediana;
            int srodek = (rozmiar - 1) / 2;
            if (rozmiar % 2 == 0) {
                mediana = (t[srodek]) + (t[srodek - 1] / 2);

            } else {
                mediana = t[srodek];
            }
            fileWriter.write("\nPosortowana tablica:\n");
            for (double el : t) {
                fileWriter.write(el + " ");
            }
            
            fileWriter.write("\nSrednia: "+ srednia);
            fileWriter.write("\nMediana: "+ mediana);
            System.out.println(srednia);
            System.out.println(mediana);
        }finally{
            if(fileWriter != null){
                fileWriter.close();
                System.out.println("zapisano!");
            }
        }
    }
}
