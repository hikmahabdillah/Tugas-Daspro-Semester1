import java.util.Scanner;

public class TugasArray14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // jml elemen
    int x = 0;
    double nilaiTertinggi, nilaiTerendah;

    System.out.print("Masukkan jumlah elemen : ");
    x = sc.nextInt();
    double[] nilai = new double[x];

    for (int i = 0; i < nilai.length; i++) {
      System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
      nilai[i] = sc.nextInt();
    }

    for (int i = 0; i < nilai.length; i++) {
      System.out.println("nilai ke-" + (i + 1) + " adalah " + nilai[i]);
    }

    double max = nilai[0];
    double min = nilai[0];
    double avg = 0;

    for (int i = 0; i < nilai.length; i++) {
      if (nilai[i] > max) {
        max = nilai[i];
      }
      if (nilai[i] < min) {
        min = nilai[i];
      }
      avg += nilai[i];
    }
    avg /= x;
    System.out.println("========================");
    System.out.println("Nilai tertinggi: " + max);
    System.out.println("Nilai terendah: " + min);
    System.out.println("Nilai rata-rata: " + avg);
  }
}
