import java.util.Scanner;

public class SegitigaAngka {

  public static void main(String[] args) {
    Scanner scan14 = new Scanner(System.in);

    System.out.print("Masukkan nilai N (minimal 3): ");
    int N = scan14.nextInt();

    if (N < 3) {
      System.out.println("Nilai N minimal harus 3 atau lebih.");
    } else {
      for (int i = 1; i <= N; i++) {
        for (int j = N; j > i; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
          System.out.print(k);
        }
        System.out.println();
      }
    }
  }
}