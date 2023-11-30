package Rekursif;

import java.util.Scanner;

public class Fibonacci {
  static int hitungPasanganMarmut(int bulan) {
    if (bulan == 1 || bulan == 2) {
      return 1;
    } else if (bulan < 1) {
      return 0;
    } else {
      return hitungPasanganMarmut(bulan - 2) + hitungPasanganMarmut(bulan - 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah bulan : ");
    int bulan = sc.nextInt();

    System.out.println("========================================================================================");
    System.out.println("|Bulan|\t\t|Pasangan Produktif|\t|Pasangan Belum produktif|\t|Total Pasangan|");
    System.out.println("========================================================================================");

    for (int i = 0; i <= bulan; i++) {
      int total = hitungPasanganMarmut(i);
      int jumlahPasangan = hitungPasanganMarmut(i - 1);
      int blmProduktif = hitungPasanganMarmut(i - 2);

      sc.close();

      System.out.println(i + "\t\t\t" + blmProduktif + "\t\t\t" + jumlahPasangan + "\t\t\t" + total);
    }
  }
}
