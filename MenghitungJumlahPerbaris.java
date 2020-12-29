import java.util.Scanner;
class MenghitungJumlahPerbaris{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        
        int baris = input.nextInt();
        int kolom = input.nextInt();
        int nilai [][] = new int [baris][kolom];
        input = new Scanner(System.in);
        baris = nilai.length;
        kolom = nilai[0].length;
        
        for(int b = 0; b < baris; b++) {
            for(int c = 0; c < kolom;c++){
              nilai [b][c] = input.nextInt();
              
            }
          
        }
         for (int b = 0; b < baris; b++) {
             total = 0;
             for(int c = 0; c < kolom; c++) {
                 total = total + nilai[b][c];
             }
             System.out.println( total);
         }
        
    }
    
}