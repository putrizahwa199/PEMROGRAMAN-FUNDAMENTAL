import java.util.Scanner;
class ArrayTerbalik {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jumlah = (5);
    int[] nilai = new int[jumlah];
    
    for (int c = 0; c < jumlah; c++) {
      System.out.print(" ");
      nilai[c] = input.nextInt();
    }
    for (int c = jumlah - 1; c >= 0; c--) {
      System.out.print(nilai[c] + " ");
    }
  }
}