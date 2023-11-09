import java.util.Scanner;

public class StarTriangle {

  public static void main(String[] args) {
    Scanner scan14 = new Scanner(System.in);

    System.out.print("Masukkan nilai N (minimal 5): ");
    int N = scan14.nextInt();

    if (N < 5) {
      System.out.println("Nilai N minimal harus 5 atau lebih.");
    } else {
      for (int i = N; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
