package Rekursif;

import java.util.Scanner;

public class PenjumlahanRekursif {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai f : ");
    int f = sc.nextInt();

    int hasil = penjumlahanRekursif(f);

    System.out.println("Proses penjumlahan : ");
    prosesPenjumlahanRekursif(f);
    System.out.println(" = " + hasil);

    sc.close();
  }

  public static int penjumlahanRekursif(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + penjumlahanRekursif(n - 1);
    }
  }

  public static void prosesPenjumlahanRekursif(int n) {
    if (n == 1) {
      System.out.print("1");
    } else {
      prosesPenjumlahanRekursif(n - 1);
      System.out.print(" + " + n);
    }
  }
}
