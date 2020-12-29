import java.util.Scanner;
class ArrayTerbalik2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jumlah = input.nextInt();
    int angka = (jumlah);
    int[] nilai = new int[angka];
    
    for (int c = 0; c < jumlah; c++) {
      System.out.print(" ");
      nilai[c] = input.nextInt();
    }
    for (int c = jumlah - 1; c >= 0; c--) {
      System.out.print(nilai[c] + " ");
    }
  }
}