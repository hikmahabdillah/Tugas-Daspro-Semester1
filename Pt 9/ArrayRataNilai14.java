import java.util.Scanner;

public class ArrayRataNilai14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = 0, lulus = 0, notLulus = 0;
    double rataLulus = 0, rataNotLulus = 0;
    int jmlLulus = 0, jmlNotLulus = 0;

    System.out.print("Masukkan jumlah mahasiswa : ");
    x = sc.nextInt();

    double[] nilaiMhs = new double[x];

    for (int i = 0; i < nilaiMhs.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
      nilaiMhs[i] = sc.nextInt();
    }

    for (int i = 0; i < nilaiMhs.length; i++) {
      if (nilaiMhs[i] > 70) {
        lulus += nilaiMhs[i];
        jmlLulus += 1;
        rataLulus = (double) lulus / jmlLulus;
      } else {
        notLulus += nilaiMhs[i];
        jmlNotLulus += 1;
        rataNotLulus = (double) notLulus / jmlNotLulus;
      }

    }
    System.out.println("Rata rata nilai lulus: " + rataLulus);
    System.out.println("Rata rata nilai tidak lulus: " + rataNotLulus);
  }
}
