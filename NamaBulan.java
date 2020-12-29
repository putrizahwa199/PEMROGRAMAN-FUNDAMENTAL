import java.util.Scanner;

public class NamaBulan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] bulan = {
                "Nomor tidak valid",
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };

        // Input bulan
        int nomorBulan = input.nextInt();
        if(nomorBulan<=12) {
          System.out.println(bulan[nomorBulan -0] );
        }
        else {
          System.out.println( "Nomor tidak valid" );

        }
    }
}
