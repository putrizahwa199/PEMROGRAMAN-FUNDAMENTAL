import java.util.Scanner;
import java.util.Locale;

class AngkaRibuan {
    public static void main(String[] args) {

        Locale bahasa = new Locale("id"); // Bahasa Indonesia
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        System.out.printf(bahasa, "Rp%,d,-\n", angka);
    }
}