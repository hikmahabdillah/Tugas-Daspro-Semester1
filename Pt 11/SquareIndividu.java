import java.util.Scanner;

public class SquareIndividu {

  public static void main(String[] args) {
    Scanner scan14 = new Scanner(System.in);

    System.out.print("Masukkan nilai N (minimal 3): ");
    int N = scan14.nextInt();

    if (N < 3) {
      System.out.println("Nilai N harus minimal 3.");
    } else {
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N; j++) {
          if (i == 1 || i == N || j == 1 || j == N) {
            System.out.print(N);
          } else {
            System.out.print(" ");
          }
          if (j < N) {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }

}
