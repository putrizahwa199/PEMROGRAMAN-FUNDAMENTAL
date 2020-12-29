import java.util.Scanner;

class GambarPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        
        for (int s = 0; s < angka; s++) {
            for (int z = 0; z < angka; z++) {
              System.out.print("* ");
            }
            System.out.println();
        }
    }
}
