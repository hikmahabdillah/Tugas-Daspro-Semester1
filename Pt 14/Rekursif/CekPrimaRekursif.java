package Rekursif;

import java.util.Scanner;

public class CekPrimaRekursif {

  public static boolean cekPrimaRekursif(int n, int x) {
    if (x <= 2) {
      return (n == 2);
    }
    if (n % x == 0) {
      return false;
    }
    if (x * x > n) {
      return true;
    }
    return cekPrimaRekursif(n, x + 1);
  }

  public static void main(String[] args) {
    Scanner input01 = new Scanner(System.in);
    System.out.print("Masukkan nilai  : ");
    int n = input01.nextInt();

    if (cekPrimaRekursif(n, 2)) {
      System.out.println(n + " adalah bilangan prima");
    } else {
      System.out.println(n + " bukan bilangan prima");
    }
    input01.close();
  }
}
