import java.util.Scanner;

public class NestedLoop_2341720049 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double temps[][] = new double[5][7];

    for (int i = 0; i < temps.length; i++) {
      System.out.println("Kota ke-" + i);
      double totSuhu = 0;
      for (int j = 0; j < temps[0].length; j++) {
        System.out.print("Hari ke-" + (j + 1) + ": ");
        temps[i][j] = scanner.nextDouble();
        totSuhu += temps[i][j];
      }
      double cityAvg = totSuhu / temps[i].length;
      System.out.println("rata rata suhu kota ke" + i + 1 + ": " + cityAvg);
      System.out.println();

    }
    // for (int i = 0; i < temps.length; i++) {
    // System.out.print("Kota ke-" + (i + 1) + ": ");
    // for (int j = 0; j < temps[0].length; j++) {
    // System.out.print(temps[i][j] + " ");
    // }
    // System.out.println();
    // }

    for (double[] cityTemps : temps) {
      for (double temp : cityTemps) {
        System.out.print(temp + " ");
      }
      System.out.println();
    }

  }
}
