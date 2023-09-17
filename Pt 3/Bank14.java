import java.util.Scanner;

public class Bank14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung; 
        double presentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println ("masukkan jumlah tabungan awal anda"); 
        jml_tabungan_awal = input.nextInt();
        System.out.println ("masukkan lama menabung anda"); 
        lama_menabung = input.nextInt();

        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("jumlah tabungan akhir anda adalah :" + jml_tabungan_akhir);
  }
}
