import java.util.Scanner;

public class ArrayRataNilai14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] nilaiMhs = new int[10];
    double total = 0, rata2;
    int lulus = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
      System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
      nilaiMhs[i] = sc.nextInt();
    }

    for (int i = 0; i < nilaiMhs.length; i++) {
      total += nilaiMhs[i];
      if (nilaiMhs[i] > 70) {
        lulus += 1;
      }
    }
    rata2 = total / nilaiMhs.length;
    System.out.println("Rata - Rata Nilai = " + rata2);

    System.out.println("banyaknya mahasiswa yang lulus : " + lulus);
  }
}
