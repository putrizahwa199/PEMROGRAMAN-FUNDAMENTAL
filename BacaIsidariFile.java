import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaIsidariFile {
	
    public static void main(String[] args) {
     String filename = "data.txt";
    
    try{
      File myFile = new File(filename);
      Scanner fileReader = new Scanner(myFile);
      
      while(fileReader.hasNextLine()){
      String data = fileReader.nextLine();
                System.out.println(data);
      }
    }catch (FileNotFoundException e) {
      System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
    }
    


       
    }
}