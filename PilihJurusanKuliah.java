import java.util.Scanner;
class PilihJurusanKuliah {
  public static void main(String[] args) {
   int jurusan;
   
   Scanner input = new Scanner(System.in);
   jurusan = input.nextInt();
   System.out.print("Selamat datang di jurusan ");
   
   String nama_jurusan;
   if(jurusan==1){
     System.out.println("Teknik Informatika");
   }else if(jurusan ==2){
     System.out.println("Sistem Informasi");
   }else if(jurusan ==3){
     System.out.println("Teknik Elektro");
   }else if(jurusan ==4){
     System.out.println("Teknik Industri");
   }else if(jurusan == 5){
     System.out.println("Matematika Terapan");
   }
  
   
   
  
  }
}