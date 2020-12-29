import java.util.Scanner;

public class SpecialSwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        
        switch ( angka ) {
            case 1:
                System.out.println("Satu");

            case 2:
                System.out.println("Dua");

            case 3:
                System.out.println("Tiga");
       
            
        }
    }
}