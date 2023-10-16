import java.util.Scanner;

public class Pemilihan2Percobaan3No14 {
  public static void main(String[] args) {
    Scanner input14 = new Scanner(System.in);
    String kategori;
    int penghasilan, gajiBersih;
    double pajak = 0;
    
    System.out.println("Masukkan Kategori : ");
    kategori = input14.nextLine();
    System.out.println("Masukkan Besarnya Penghasilan : ");
    penghasilan = input14.nextInt();

    // ignorecase untuk mengabaikan besar kecilnya huruf, yang artinya insensitif case
    if (kategori.equals("pekerja")) {
      if (penghasilan <= 2000000) {
        pajak = 0.1;
      }else if(penghasilan <= 3000000){
        pajak = 0.15;
      }else{
        pajak = 0.2;
      }
      gajiBersih = (int) (penghasilan - (pajak * penghasilan));
      System.out.print("Penghasilan Bersih : " + gajiBersih);
      
    }else if(kategori.equals("pebisnis")){
      if (penghasilan <= 2500000) {
        pajak = 0.15;
      }else if (penghasilan <= 3500000) {
        pajak = 0.2;
      }else{
        pajak = 0.25;
      }
      gajiBersih = (int) (penghasilan - (pajak * penghasilan));
      System.out.print("Penghasilan Bersih : " + gajiBersih);
    }else {
      System.out.println("Masukan Kategori Salah");
    }
  }
}
