import java.util.Scanner;

public class HargaBayar14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int harga, jumlah, jmlHalBuku;
    double dis, total, bayar, jmlDis;
    String merkBuku;

    System.out.println("Masukkan merk buku yang dibeli");
    merkBuku =input.next();
    System.out.println("Masukkan jumlah halaman buku yang dibeli");
    jmlHalBuku =input.nextInt();
    System.out.println("Masukkan harga barang yang dibeli");
    harga =input.nextInt();
    System.out.println("Masukkan besaran diskon");
    dis =input.nextDouble();
    System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
    jumlah =input.nextInt();

    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;
    System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    

  }
}
