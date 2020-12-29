import java.util.Scanner;

class GarisPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
                
        for (int s = 1; s <= jumlah; s++) {
            for (int z = 0; z <= jumlah; z++) {
				if ((s == 1) || (s == jumlah) || (z == 0) || (z == jumlah)) {
					System.out.print("#");
                }
                else {
					System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}          
		