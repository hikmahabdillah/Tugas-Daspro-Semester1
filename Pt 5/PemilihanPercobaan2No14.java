import java.util.Scanner;

/**
 * PemilihanPercobaan2No14
 */
public class PemilihanPercobaan2No14 {
  public static void main(String[] args) {
     Scanner input14 = new Scanner(System.in);

    System.out.print("Nilai uas   : ");
    float uas = input14.nextFloat();
    System.out.print("Nilai uts   : ");
    float uts = input14.nextFloat();
    System.out.print("Nilai kuis   : ");
    float kuis = input14.nextFloat();
    System.out.print("Nilai tugas   : ");
    float tugas = input14.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

    // String message = total < 65 ? "Remidi" : "Tidak remidi";

    String message;
    if(total <= 100 && total > 80){
      message = "Nilai Anda 'A' dan setara dengan '4' dengan kualifikasi Sangat baik";
    }else if (total <= 80 && total > 73) {
      message = "Nilai Anda 'B+' dan setara dengan '3.5' dengan kualifikasi Lebih dari baik";
      
    }else if (total <= 73 && total > 65){
      message = "Nilai Anda 'B' dan setara dengan '3' dengan kualifikasi Baik";
      
    }else if (total <=65 && total > 60) {
      message = "Nilai Anda 'C+' dan setara dengan '2.5' dengan kualifikasi Lebih dari cukup";
      
    }else if (total <= 60 && total > 50){
      message = "Nilai Anda 'C' dan setara dengan '2' dengan kualifikasi Cukup";
      
    }else if (total <= 50 && total > 39){
      message = "Nilai Anda 'D' dan setara dengan '1' dengan kualifikasi Kurang";
      
    }else{
      message = "Nilai Anda 'E' dan setara dengan '0' dengan kualifikasi Gagal";

    }


    System.out.println("Nilai akhir = " + total + " sehingga " + message);
  }
  
}